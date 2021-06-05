package cn.yang.puppet.client;

import cn.yang.common.util.PropertiesUtil;
import cn.yang.puppet.client.constant.ConfigConstants;
import cn.yang.puppet.client.ui.impl.PuppetDesktop;
import io.grpc.netty.shaded.io.grpc.netty.NegotiationType;
import io.grpc.netty.shaded.io.grpc.netty.NettyChannelBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import cn.yang.puppet.client.ui.PuppetConnectionPopUp;

import java.io.IOException;

/**
 * @author Cool-Coding
 * 2018/7/25
 * Puppet启动器
 */
public class PuppetStarter {
    /** logger */
    private static final Logger LOGGER = LoggerFactory.getLogger(PuppetStarter.class);

    public static io.grpc.Channel goRobotChannel;

    public static void main(String[] args) throws IOException {
        // 1. 初始化spring类
        final ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("puppet-beans.xml");
        context.start();

        // 2. 连接gorobot
        ConnectGoRobotIfNecessary();

        /*3. 连接server
         * 将连接服务器放在spring初始化bean后，有两个原因:
         * 3.1.防止阻塞spring初始化bean
         * 3.2.连接服务器后可能需要做出一些处理，处理中可能需要使用spring bean，而此时spring bean可能尚未
         *   初始化完成。例如cn.yang.puppet.client.commandhandler.AbstractPuppetCommandHandler类中
         *   静态成员变量generator
         */
        try {
            context.getBean(PuppetDesktop.class).connect();
        }catch (Exception e){
            LOGGER.error(e.getMessage(),e);
        }
    }

    private static void ConnectGoRobotIfNecessary() throws IOException {
        boolean ServerRecorded=false;
        if(ServerRecorded==false){
            PuppetConnectionPopUp ServerDataPopup=new PuppetConnectionPopUp();
            while(true){
                if(ServerDataPopup.getButtonPressed()==true) {
                    ServerRecorded=true;
                    break;
                }
                System.out.print("loop in progress\n");
            }
        }
        String robot = PropertiesUtil.getString(ConfigConstants.CONFIG_FILE_PATH,ConfigConstants.ROBOT);
        if ("goRobot".equals(robot)) {
            String endpoint = PropertiesUtil.getString(ConfigConstants.CONFIG_FILE_PATH, ConfigConstants.GO_ROBOT_ENDPOINT,"127.0.0.1:12345");
            String[] endpointSplit = endpoint.split(":");
            endpointSplit[0]=PropertiesUtil.getString(ConfigConstants.CONFIG_USER_FILE_PATH,ConfigConstants.SERVER_IP);
            endpointSplit[1]=PropertiesUtil.getString(ConfigConstants.CONFIG_USER_FILE_PATH,ConfigConstants.SERVER_PORT);
            goRobotChannel = NettyChannelBuilder.forAddress(endpointSplit[0], Integer.parseInt(endpointSplit[1]))
                    .negotiationType(NegotiationType.PLAINTEXT)
                    .build();
            //配置文件应该可以写入，在IDEA中的配置文件路径在META-INF下，实际部署中直接将配置文件直接放在根目录
            //todo 可以考虑创建配置文件夹，专门放入配置文件。
        }
    }


}

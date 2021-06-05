package cn.yang.puppet.client.netty;

import cn.yang.common.netty.ChannelInitializer;
import cn.yang.common.util.PropertiesUtil;
import cn.yang.common.util.TaskExecutors;
import cn.yang.common.netty.INettyClient;
import cn.yang.puppet.client.commandhandler.AbstractPuppetCommandHandler;
import cn.yang.puppet.client.constant.ConfigConstants;
import cn.yang.puppet.client.constant.ExceptionMessageConstants;
import cn.yang.puppet.client.exception.PuppetClientException;
import cn.yang.puppet.client.ui.PuppetConnectionPopUp;
import io.netty.bootstrap.Bootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelOption;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioSocketChannel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.*;
import java.applet.*;

/**
 * @author Cool-Coding
 * 2018/7/24
 */
public class PuppetNettyClient implements INettyClient {
    /**
     * 处理器初始化器
     */
    private ChannelInitializer channelInitialize;
    private boolean ServerRecorded=false;
    private NioEventLoopGroup group;

    /** logger */
    private static final Logger LOGGER = LoggerFactory.getLogger(PuppetNettyClient.class);

    private String host;
    private int port;

    //与服务器的连结次数
    private int connectionCount=1;
    boolean ButtonPressed=false;
    public void init() throws PuppetClientException{
        group = new NioEventLoopGroup();
        host = PropertiesUtil.getString(ConfigConstants.CONFIG_FILE_PATH, ConfigConstants.SERVER_IP);
        port = PropertiesUtil.getInt(ConfigConstants.CONFIG_FILE_PATH, ConfigConstants.SERVER_PORT);
    }



    @Override
    public void connect(){
            host=PropertiesUtil.getString(ConfigConstants.CONFIG_USER_FILE_PATH,ConfigConstants.SERVER_IP);
            port=Integer.parseInt(PropertiesUtil.getString(ConfigConstants.CONFIG_USER_FILE_PATH,ConfigConstants.SERVER_PORT));
            final Bootstrap bootstrap = new Bootstrap();
            //group = new NioEventLoopGroup();
            bootstrap.group(group)
                    .channel(NioSocketChannel.class)
                    .option(ChannelOption.TCP_NODELAY, true)
                    .handler(channelInitialize);
            if (channelInitialize.getChannelHandler() instanceof PuppetNettyClientHandler) {
                try{
                            final ChannelFuture sync = bootstrap.connect(host, port).sync();
                            sync.channel().writeAndFlush(AbstractPuppetCommandHandler.buildConnectionRequest(connectionCount++));
                            sync.channel().closeFuture().sync();
                } catch (Exception e) {
                    LOGGER.error(e.getMessage(), e);
                } finally {
                    //如果连接断开了，重新与服务器连接
                    int interval=PropertiesUtil.getInt(ConfigConstants.CONFIG_FILE_PATH, ConfigConstants.RECONNECT_INTERVAL);
                    LOGGER.error(ExceptionMessageConstants.DISCONNECT_TO_SERVER, host, port,interval);
                    TaskExecutors.submit(this::connect,interval );
                }
            }else {
                throw new RuntimeException(ExceptionMessageConstants.PUPPET_HANDLER_ERROR);
            }

    }
    /*

    if(ServerRecorded==false){
            PuppetConnectionPopUp ServerDataPopup=new PuppetConnectionPopUp();
            while(true){
                if(ServerDataPopup.getButtonPressed()==true) {
                    host= ServerDataPopup.getHost();
                    port= ServerDataPopup.getPort();
                    ServerRecorded=true;
                    break;
                }
                System.out.print("loop in progress\n");
            }
            System.out.print(host+":"+port);
        }


     */

    public void setChannelInitialize(ChannelInitializer channelInitialize) {
        this.channelInitialize = channelInitialize;
    }

    public void destroy(){
        group.shutdownGracefully();
    }

}

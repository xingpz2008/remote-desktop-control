package cn.yang.master.client.netty;

import cn.yang.common.command.Commands;
import cn.yang.common.constant.Constants;
import cn.yang.common.dto.Request;
import cn.yang.common.generator.SequenceGenerate;
import cn.yang.common.netty.ChannelInitializer;
import cn.yang.common.netty.INettyClient;
import cn.yang.common.util.BeanUtil;
import cn.yang.common.util.MacUtils;
import cn.yang.common.util.PropertiesUtil;
import cn.yang.master.client.constant.ConfigConstants;
import cn.yang.master.client.constant.ExceptionMessageConstants;
import cn.yang.master.client.exception.MasterChannelHandlerException;
import cn.yang.master.client.exception.MasterClientException;
import io.netty.bootstrap.Bootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelOption;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioSocketChannel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.StringUtils;

/**
 * @author Cool-Coding
 * 2018/7/24
 * Netty客户端，负责控制端与服务器的通信，包括所有请求数据的发送接收
 */
public class MasterNettyClient implements INettyClient{
    /**
     * 处理器初始化器
     */
    private ChannelInitializer channelInitialize;

    private NioEventLoopGroup group;

    /** logger */
    private static final Logger LOGGER = LoggerFactory.getLogger(MasterNettyClient.class);

    private String host;
    private int port;

    /**
     * 初始化
     */
    public void init(){
        group = new NioEventLoopGroup();
        host = PropertiesUtil.getString(ConfigConstants.CONFIG_FILE_PATH, ConfigConstants.SERVER_IP);
        port = PropertiesUtil.getInt(ConfigConstants.CONFIG_FILE_PATH, ConfigConstants.SERVER_PORT);

    }

    /**
     * 启动时连接服务器
     * @throws Exception
     */
    @Override
    public void connect() throws Exception{
        final Bootstrap bootstrap = new Bootstrap();
        bootstrap.group(group)
                .channel(NioSocketChannel.class)
                .option(ChannelOption.TCP_NODELAY, true)
                .handler(channelInitialize);
        final ChannelFuture sync = bootstrap.connect(host, port).sync();
        sync.channel().writeAndFlush(buildConnectRequest());
        try {
                sync.channel().closeFuture();
        }catch (Exception e){
                LOGGER.error(e.getMessage(),e);
                throw e;
        }
    }

    /**
     * 发送命令
     * @param puppetName 傀儡名
     * @param command    命令
     * @param data       数据
     * @throws MasterClientException
     */
    public void fireCommand(String puppetName,Enum<Commands> command,Object data) throws MasterClientException{
        try {
            getChannelHandler().fireCommand(puppetName,command,data);
        }catch (MasterChannelHandlerException e){
           throw new MasterClientException(e.getMessage(),e);
        }
    }


    private MasterNettyClientHandler getChannelHandler(){
        if (channelInitialize.getChannelHandler() instanceof MasterNettyClientHandler) {
            return  (MasterNettyClientHandler) channelInitialize.getChannelHandler();
        } else {
            final String message = String.format("%s %s", ExceptionMessageConstants.HANDLER_NOT_SUPPORTED, channelInitialize.getChannelHandler());
            LOGGER.error(message);
            throw new RuntimeException(message);
        }
    }

    private Request buildConnectRequest() throws MasterClientException{
        String mac= MacUtils.getMAC();
        if (StringUtils.isEmpty(mac)){
            return null;
        }

        final SequenceGenerate generator = BeanUtil.getBean(SequenceGenerate.class);

        Request request = new Request();
        request.setId(Constants.MASTER + mac + generator.next());
        request.setCommand(Commands.CONNECT);
        return request;
    }

    public void setChannelInitialize(ChannelInitializer channelInitialize) {
        this.channelInitialize = channelInitialize;
    }

    public void destroy(){
        group.shutdownGracefully();
    }
}

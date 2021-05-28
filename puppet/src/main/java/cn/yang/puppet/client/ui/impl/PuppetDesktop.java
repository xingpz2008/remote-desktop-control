package cn.yang.puppet.client.ui.impl;


import cn.yang.common.constant.Constants;
import cn.yang.common.util.ImageUtils;
import cn.yang.common.netty.INettyClient;
import cn.yang.puppet.client.exception.HeartBeatException;
import cn.yang.puppet.client.netty.PuppetNettyClient;
import java.awt.*;
import java.awt.image.BufferedImage;

/**
 * @author Cool-Coding
 *         2018/7/25
 */

/*UI Realization region below
        Frame IPSettingFrame=new Frame();
                IPSettingFrame.setSize(500,300);

                IPSettingFrame.setTitle("服务器参数设置");
                IPSettingFrame.setLayout(new BorderLayout());
                Panel FramePanel=new Panel();
                FramePanel.setLayout(new GridLayout(3,2));
                FramePanel.add(new Label("服务器IP",Label.LEFT),0);
                TextField Server=new TextField(300);
                FramePanel.add(Server);
                FramePanel.add(new Label("端口号",Label.LEFT));
                TextField Port=new TextField(100);
                FramePanel.add(Port);
                Button ConfirmButton=new Button("确认");
                FramePanel.add(ConfirmButton);
                ConfirmButton.addActionListener(new ActionListener() {
@Override
public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand()=="确认") {
        host = Server.getText();
        port = Integer.parseInt(Port.getText());
        //ConfirmButton.setBackground(new Color((int)(Math.random()*256),(int)(Math.random()*256),(int)(Math.random()*256)));
        IPSettingFrame.setVisible(false);
        ButtonPressed = true;
        }
        }
        }
        );
        IPSettingFrame.setVisible(true);
//end of UI Realization region*/

/*old code region
public class PuppetDesktop implements INettyClient  {

    private INettyClient puppetClient;
    private Toolkit toolkit;

    /**
     * 清晰度[10,100]
     *//*
    private int quality;

    public PuppetDesktop(){
        toolkit=Toolkit.getDefaultToolkit();
        //默认清晰度
        quality= Constants.SCREEN_QUALITY;
    }


    public byte[] getScreenSnapshot(){
        //获取屏幕分辨率
        Dimension d = toolkit.getScreenSize ();
        //以屏幕的尺寸创建个矩形
        Rectangle screenRect = new Rectangle(d);
        //截图（截取整个屏幕图片）
        BufferedImage bufferedImage =  getRobot().createScreenCapture(screenRect);
        return ImageUtils.compressedImageAndGetByteArray(bufferedImage,quality/100.0f);
    }


    @Override
    public void connect() throws Exception{

        puppetClient.connect();
    }

    public void setPuppetClient(PuppetNettyClient puppetClient) {
        this.puppetClient = puppetClient;
    }

    public void setQuality(int quality) {
        this.quality = quality;
    }
}
*/




/**
 * @author Cool-Coding
 *         2018/7/25
 */
public class PuppetDesktop implements INettyClient {

    private INettyClient puppetClient;


    @Override
    public void connect() throws Exception{
        puppetClient.connect();
    }

    public void setPuppetClient(PuppetNettyClient puppetClient) {
        this.puppetClient = puppetClient;
    }

}
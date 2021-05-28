package cn.yang.puppet.client.ui;

import java.awt.*;
import java.awt.event.*;
import cn.yang.puppet.client.netty.PuppetNettyClient;
import cn.yang.puppet.client.constant.ConfigConstants;
import java.io.*;

public class PuppetConnectionPopUp extends Frame {
    private String host;
    private int port;
    private boolean ButtonPressed=false;
    public PuppetConnectionPopUp() {
        Frame IPSettingFrame=new Frame();
        IPSettingFrame.setSize(500,300);
        IPSettingFrame.setFont(new Font("宋体",Font.PLAIN,14));
        IPSettingFrame.setTitle("服务器参数设置");
        IPSettingFrame.setLayout(new BorderLayout());
        Panel FramePanel=new Panel();
        IPSettingFrame.add(FramePanel);
        FramePanel.setLayout(new GridLayout(3,2));
        FramePanel.add(new Label("服务器IP",Label.CENTER));
        TextField Server=new TextField(15);
        FramePanel.add(Server);
        FramePanel.add(new Label("端口号",Label.CENTER));
        TextField Port=new TextField(5);
        FramePanel.add(Port);
        Button ConfirmButton=new Button("确认");
        FramePanel.add(ConfirmButton);
        IPSettingFrame.setVisible(true);
        ConfirmButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                host=Server.getText();
                port=Integer.parseInt(Port.getText());
                //ConfirmButton.setBackground(new Color((int)(Math.random()*256),(int)(Math.random()*256),(int)(Math.random()*256)));
                System.out.print(host+" "+port+"\n");
                try {
                    PuppetConnectionPupUpIO UserDataIO=new PuppetConnectionPupUpIO(ConfigConstants.CONFIG_USER_FILE_PATH);
                    UserDataIO.PuppetConnectionPupUpCacheClear(ConfigConstants.CONFIG_USER_FILE_PATH);
                    //删除之前的用户缓存
                    UserDataIO.PuppetConnectionPupUpWrite("server.ip="+host+"\n");
                    UserDataIO.PuppetConnectionPupUpWrite("server.port="+port+"\n");
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }
                //将用户输入的服务器地址和服务器端口写入文件，后续直接从新文件读取
                ButtonPressed=true;
                IPSettingFrame.setVisible(false);
            }
        });
    }
    public String getHost(){return host;}
    public int getPort(){return port;}
    public boolean getButtonPressed(){return ButtonPressed;}
}

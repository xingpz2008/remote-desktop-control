package cn.yang.server.P2P;

import cn.yang.server.constant.P2PConstants;

import java.io.*;


//P2PIOStream用于服务器端P2P的初始化，内容包括从服务器的输入内容中获得应该写入配置文件中的端口号
//文件的格式为
/*
[proxy]
listen = ":"
 */

public class P2PIOStream{
    private int port;
    public void P2PIOStreamWrite(int netty_port) {
        //String 代表服务器端的配置文件，server.conf
        port=netty_port;
        String fileString= P2PConstants.P2P_CONFIG_FILE_PATH;
        try {
            P2PFileIO FileIOStream=new P2PFileIO();
            fileString=FileIOStream.getCurrentDirPath()+fileString;
            System.out.print(fileString+"\n");
            File file = new File(fileString);
            FileWriter fileWriter = new FileWriter(fileString);
            String filecnt_1 = "[proxy]\nlisten = \":";
            String filecnt_2 = "\"";
            fileWriter.write(filecnt_1 + port + filecnt_2);
            fileWriter.close();
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}

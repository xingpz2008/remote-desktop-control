package cn.yang.puppet.client.ui;

import cn.yang.puppet.client.constant.ConfigConstants;

import java.io.*;

public class PuppetConnectionPupUpIO {
    private String classString;
    public PuppetConnectionPupUpIO()
    {

    }

    public void PuppetConnectionPupUpIOCreate(String string)  throws IOException{
        classString=string;
        File file =new File(string);      //ConfigConstants.CONFIG_USER_FILE_PATH
        if(!file.exists()) {
            file.createNewFile();
        }
    }
    public void PuppetConnectionPupUpWrite(String string) throws IOException{
        File file =new File(classString);
        FileWriter fileWriter = new FileWriter(file.getName(),true);
        fileWriter.write(string);
        //string should be User Server Name and Server port
        fileWriter.close();
    }
    public void PuppetConnectionPupUpCacheClear(String string) throws IOException {
        File file =new File(string);
        if(file.exists()) {
            file.delete();
        }
    }
}

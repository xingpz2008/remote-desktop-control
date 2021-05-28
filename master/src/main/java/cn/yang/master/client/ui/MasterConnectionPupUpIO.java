package cn.yang.master.client.ui;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class MasterConnectionPupUpIO {
    private String classString;
    public MasterConnectionPupUpIO(String string)  throws IOException{
        classString=string;
        File file =new File(string);      //ConfigConstants.CONFIG_USER_FILE_PATH
        if(!file.exists()) {
            file.createNewFile();
        }
    }
    public void MasterConnectionPupUpWrite(String string) throws IOException{
        File file =new File(classString);
        FileWriter fileWriter = new FileWriter(file.getName(),true);
        fileWriter.write(string);
        //string should be User Server Name and Server port
        fileWriter.close();
    }
    public void MasterConnectionPupUpCacheClear(String string) throws IOException {
        File file =new File(string);
        if(file.exists()) {
            file.delete();
        }
    }
}

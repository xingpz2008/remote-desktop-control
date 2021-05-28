package cn.yang.server.P2P;

import cn.yang.server.constant.P2PConstants;
import cn.yang.common.util.SysDtr.*;
import java.io.File;
import java.io.IOException;


public class P2PGoExec {
    public P2PGoExec() throws IOException {
        //运行Go语言make file脚本
        //运行Go语言.exe文件
        //首先判断系统类型，Window or Linux
        OsInfoUtil OsNowUsing=new OsInfoUtil();
        if (OsNowUsing.isLinux()==true)
        {
            //运行Linux版本编译的proxy（.bin）
            OsNowUsing.executeLinuxCmd("./proxy");
            //todo 上述均假设运行成功。运行失败需要重写逻辑
        }
        else
        {
            if(OsNowUsing.isWindows()==true)
            {
                //运行Windows版本编译的proxy.exe
                File directory = new File(".");
                String CurrentPath=directory.getCanonicalPath();
                //修改转义符
                CurrentPath.replace("/","\\");
                OsNowUsing.executeLinuxCmd("cmd /c start "+CurrentPath+"\\proxy.exe");
                //proxy文件应当存放在.jar文件的相同根目录中。
                //todo 上述均假设运行成功。运行失败需要重写逻辑
            }
            else
            {
                System.out.print(P2PConstants.EXEC_SYSTEM_NOT_SUPPORTED);
            }
        }
    }
}

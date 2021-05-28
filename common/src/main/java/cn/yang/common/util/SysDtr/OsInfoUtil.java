package cn.yang.common.util.SysDtr;

import java.util.List;
import java.util.ArrayList;
import java.io.InputStream;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;


public class OsInfoUtil {
    private static String OS = System.getProperty("os.name").toLowerCase();

    private static OsInfoUtil _instance = new OsInfoUtil();

    private OsType platform;

    public OsInfoUtil() {
    }

    public static boolean isLinux() {
        return OS.indexOf("linux") >= 0;
    }

    public static boolean isMacOS() {
        return OS.indexOf("mac") >= 0 && OS.indexOf("os") > 0 && OS.indexOf("x") < 0;
    }

    public static boolean isMacOSX() {
        return OS.indexOf("mac") >= 0 && OS.indexOf("os") > 0 && OS.indexOf("x") > 0;
    }

    public static boolean isWindows() {
        return OS.indexOf("windows") >= 0;

    }
    public static OsType getOSname() {
        if (isLinux()) {
            _instance.platform = OsType.Linux;
        } else if (isMacOS()) {
            _instance.platform = OsType.Mac_OS;
        } else if (isMacOSX()) {
            _instance.platform = OsType.Mac_OS_X;
        } else if (isWindows()) {
            _instance.platform = OsType.Windows;
        }
        return _instance.platform;
    }

    public String executeLinuxCmd(String cmd) {
        //System.out.println("got cmd job : " + cmd);
        Runtime run = Runtime.getRuntime();
        try {
            Process process = run.exec(cmd);
            InputStream in = process.getInputStream();
            BufferedReader bs = new BufferedReader(new InputStreamReader(in));
            // System.out.println("[check] now size \n"+bs.readLine());
            StringBuffer out = new StringBuffer();
            byte[] b = new byte[8192];
            for (int n; (n = in.read(b)) != -1;)
            {
            out.append(new String(b, 0, n));
            }
            //System.out.println("job result [" + out.toString() + "]");
            in.close();
            // process.waitFor();
            process.destroy();
            //return result;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

}


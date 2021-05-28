package cn.yang.puppet.client.constant;

/**
 * @author Cool-Coding
 *         2018/7/25
 */
public class ConfigConstants {
    /**
     * 配置文件名
     */
    public static final String CONFIG_FILE_PATH= "puppet-config.txt";
    public static final String CONFIG_USER_FILE_PATH="puppet-user-config.txt";
    public static final String HEARTBEAT_INTERVAL="heartbeat.interval";
    public static final String RECONNECT_INTERVAL="reconnect.interval";
    public static final String TASK_CHECK_INTERVAL="task.check.interval";
    public static final String SERVER_IP="server.ip";
    public static final String SERVER_PORT="server.port";
    public static final String ERROR_COUNT="error.count";
    public static final String SCREEN_REFRESH_FREQUENCY="screen.refresh.frequency";

    /**
     * goRobot   使用robotgo实现
     * javaRobot 使用java自带robot实现
     */
    public static final String ROBOT = "robot";
    public static final String GO_ROBOT_ENDPOINT = "go.robot.endpoint";

}

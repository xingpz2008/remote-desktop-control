package cn.yang.server.P2P;

import org.apache.commons.io.IOUtils;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.util.FileCopyUtils;

import java.io.*;
import java.net.URL;
import java.net.URLDecoder;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class P2PFileIO {
    /**
     * 将jar内的文件复制到jar包外的同级目录下
     */

        private static InputStream getResource(String location) throws IOException {
            PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
            InputStream in = resolver.getResource(location).getInputStream();
            byte[] byteArray = IOUtils.toByteArray(in);
            in.close();
            return new ByteArrayInputStream(byteArray);
        }

        /**
         * 获取项目所在文件夹的绝对路径
         *
         * @return
         */
        public static String getCurrentDirPath() throws UnsupportedEncodingException {
            URL url = FileCopyUtils.class.getProtectionDomain().getCodeSource().getLocation();
            String path = url.getPath();
            if (path.startsWith("file:")) {
                path = path.replace("file:", "");
            }
            if (path.contains(".jar!/")) {
                path = path.substring(0, path.indexOf(".jar!/") + 4);
            }

            File file = new File(path);
            path = file.getParentFile().getAbsolutePath();
            path= URLDecoder.decode(path,"utf-8");
            return path;
        }

        private static Path getDistFile(String path) throws IOException {
            String currentRealPath = getCurrentDirPath();
            Path dist = Paths.get(currentRealPath + File.separator + path);
            Path parent = dist.getParent();
            if (parent != null) {
                Files.createDirectories(parent);
            }
            Files.deleteIfExists(dist);
            return dist;
        }

        /**
         * 复制classpath下的文件到jar包的同级目录下
         *
         * @param location 相对路径文件,例如kafka/kafka_client_jaas.conf
         * @return
         * @throws IOException
         */
        public static String copy(String location) throws IOException {
            InputStream in = getResource("classpath:" + location);
            Path dist = getDistFile(location);
            Files.copy(in, dist);
            in.close();
            return dist.toAbsolutePath().toString();
        }


}

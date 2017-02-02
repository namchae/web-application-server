package util;

import org.junit.Test;

import java.io.File;
import java.nio.file.Files;

/**
 * Created by namchae on 2017. 2. 2..
 */
public class FileTest {
    @Test
    public void getFileResource() {
        try {
            String url = "/index.html";
            byte[] body = Files.readAllBytes(new File("./webapp" + url).toPath());
            System.out.println(body.length);
        } catch (Exception ex) {
            ex.printStackTrace();
        }


    }
}

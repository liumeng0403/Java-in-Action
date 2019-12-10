package org.lm;

import lombok.Cleanup;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class AtCleanup {

    @Test
    public void test() throws FileNotFoundException, IOException {
        @Cleanup
        InputStream in=new FileInputStream("c:\\test.txt");

    }

    /**
     * @Cleanup
     * 1.自动生成 默认构造方法
     * 2.用在 变量 前面，可以保证此变量代表的资源会被自动关闭，默认是调用资源的 close() 方法，
     *   如果该资源有其它关闭方法，可使用 @Cleanup(“methodName”) 来指定要调用的方法
     */

}

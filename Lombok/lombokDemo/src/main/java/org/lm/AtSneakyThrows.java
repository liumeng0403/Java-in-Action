package org.lm;

import lombok.Cleanup;
import lombok.SneakyThrows;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class AtSneakyThrows {

    @Test
    @SneakyThrows(IOException.class)
    public void test(){
        @Cleanup
        InputStream in=new FileInputStream("c:\\test.txt");
    }

    /**
     * @SneakyThrows
     * 1.自动生成 默认构造函数
     * 2.用在 方法 上，可以将方法中的代码用 try-catch 语句包裹起来，捕获异常并在 catch 中用 Lombok.sneakyThrow(e) 把异常抛出，
     *   可以使用 @SneakyThrows(Exception.class) 的形式指定抛出哪种异常
     */

}

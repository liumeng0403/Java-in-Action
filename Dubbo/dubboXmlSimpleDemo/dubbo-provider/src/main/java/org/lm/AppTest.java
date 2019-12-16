package org.lm;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.io.IOException;

/**
 * 服务提供方 测试类
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:dubbo-provider.xml")
public class AppTest 
{
    /**
     *
     */
    @Test
    public void startProvider()
        throws IOException
    {
        System.out.println("Dubbo Provider Starded ...");
        System.in.read();
    }
}

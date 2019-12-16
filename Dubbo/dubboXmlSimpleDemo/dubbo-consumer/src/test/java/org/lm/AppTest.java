package org.lm;

import static org.junit.Assert.assertTrue;

import jdk.management.resource.internal.inst.FileOutputStreamRMHooks;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.lm.apis.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 服务消费测试
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:dubbo-consumer.xml")
public class AppTest 
{
    @SuppressWarnings("all")
    @Autowired
    private HelloService helloService;

    /**
     *
     */
    @Test
    public void startConsumer() throws InterruptedException
    {
        for (int i=0;i<10;i++){
            Thread.sleep(1000);
            System.out.println(helloService.sayHello("lm"));
        }
    }
}

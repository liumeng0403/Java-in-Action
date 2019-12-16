package org.lm.providers;

import com.alibaba.dubbo.rpc.RpcContext;
import org.lm.apis.HelloService;

import java.time.LocalDateTime;

/**
 * 服务提供方实现
 */
public class HelloServiceImpl implements HelloService {

    /**
     * api sayHello 方法实现
     *
     * @param name
     * @return
     */
    @Override
    public String sayHello(String name) {
        System.out.println(LocalDateTime.now() + " hello " + name + ", respone from provider: " + RpcContext.getContext().getLocalAddress());
        return "Hello " + name + " !";
    }
}

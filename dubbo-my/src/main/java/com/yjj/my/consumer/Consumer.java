package com.yjj.my.consumer;

import com.yjj.my.api.HelloService;
import com.yjj.my.framework.RpcFramework;

/**
 * @Description:
 * @Author: yinjunjie
 * @CreateDate: 2018/8/7 10:36
 * @Version: 1.0
 */
public class Consumer {
    public static void main(String[] args) throws InterruptedException {
        //此处返回其实是一个代理对象
        HelloService service = RpcFramework.referService(HelloService.class, "127.0.0.1", 1234);
        for (int i = 0; i < Integer.MAX_VALUE; i ++) {
            //当执行目标方法时会执行代理对象的invoke方法，关于代理详见我另一篇文章https://www.jianshu.com/p/b685466b1001
            String hello = service.sayHello("World" + i);
            System.out.println(hello);
            Thread.sleep(1000);
        }
    }

}

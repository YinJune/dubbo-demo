package com.yjj.my.api;

/**
 * @Description:
 * @Author: yinjunjie
 * @CreateDate: 2018/8/7 13:17
 * @Version: 1.0
 */
public class HelloServiceImpl implements HelloService {
    @Override
    public String sayHello(String name) {
        return "hello "+name;
    }
}

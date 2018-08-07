package com.yjj.my.provider;

import com.yjj.my.api.HelloService;
import com.yjj.my.api.HelloServiceImpl;
import com.yjj.my.framework.RpcFramework;

import java.io.IOException;

/**
 * @Description:
 * @Author: yinjunjie
 * @CreateDate: 2018/8/7 10:38
 * @Version: 1.0
 */
public class Provider {
    public static void main(String[] args) throws IOException {
        HelloService service = new HelloServiceImpl();
        RpcFramework.exportService(service, 1234);
    }
}

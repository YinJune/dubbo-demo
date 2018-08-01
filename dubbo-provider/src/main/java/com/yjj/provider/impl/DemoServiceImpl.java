package com.yjj.provider.impl;

import com.yjj.api.DemoService;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description:
 * @Author: yinjunjie
 * @CreateDate: 2018/8/1 14:45
 * @Version: 1.0
 */
public class DemoServiceImpl implements DemoService {
    public List<String> getPermissions(Long id) {
        List<String> demo = new ArrayList<String>();
        demo.add(String.format("Permission_%d", id - 1));
        demo.add(String.format("Permission_%d", id));
        demo.add(String.format("Permission_%d", id + 1));
        return demo;
    }

}

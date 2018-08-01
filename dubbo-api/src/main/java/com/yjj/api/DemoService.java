package com.yjj.api;

import java.util.List;

/**
 * @Description:
 * @Author: yinjunjie
 * @CreateDate: 2018/8/1 14:43
 * @Version: 1.0
 */
public interface DemoService {
    List<String> getPermissions(Long id);
}

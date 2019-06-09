package com.itheima.dao.impl;

import com.itheima.dao.AopDao;
import com.itheima.service.AopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: zh
 * @Date: 2019/6/3 16:57
 */
@Service
public class AopServiceImpl implements AopService {
    @Autowired
    private AopDao aopDao;


}

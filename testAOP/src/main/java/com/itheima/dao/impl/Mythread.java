package com.itheima.dao.impl;

/**
 * @Author: zh
 * @Date: 2019/6/4 14:17
 */
public class Mythread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(i);
        }
    }
}

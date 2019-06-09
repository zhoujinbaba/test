package com.itheima;

/**
 * @Author: zh
 * @Date: 2019/5/20 21:25
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"正在执行。。。。。");
    }
}

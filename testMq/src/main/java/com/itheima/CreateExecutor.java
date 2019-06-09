package com.itheima;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Author: zh
 * @Date: 2019/5/20 21:23
 */
public class CreateExecutor {
    public static void main(String[] args) {
        // 创建固定大小的线程池
        ExecutorService threadPool = Executors.newFixedThreadPool(3);
        //创建了thread对象
        MyThread myThread1 = new MyThread();
        MyThread myThread2 = new MyThread();
        MyThread myThread3 = new MyThread();
        MyThread myThread4 = new MyThread();
        MyThread myThread5 = new MyThread();

        //将线程放入线程池中执行
        threadPool.execute(myThread1);
        threadPool.execute(myThread2);
        threadPool.execute(myThread3);
        threadPool.execute(myThread4);
        threadPool.execute(myThread5);

        //关闭线程池
        threadPool.shutdown();


    }
}


package com.itheima;

/**
 * @Author: zh
 * @Date: 2019/5/18 18:19
 */
public interface TestInterface {
     static void staticMethod(){
        System.out.println("静态方法");
    };

    void method1();//抽象方法

    default void method2(){
        System.out.println("默认方法");
    };


}

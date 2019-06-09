package com.itheima.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @Author: zh
 * @Date: 2019/6/5 21:12
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring/spring-redis.xml")
public class TestTemplate {
    @Autowired
    private RedisTemplate redisTemplate;
    @Test
    public void testAddValue() {
        redisTemplate.boundValueOps("haoeg").set("gqgqbgo  ");

    }
    /***
     * 查询数据
     */
    @Test
    public void testGetValue(){
        String name = (String) redisTemplate.boundValueOps("haoeg").get();
        System.out.println(name);
    }

}

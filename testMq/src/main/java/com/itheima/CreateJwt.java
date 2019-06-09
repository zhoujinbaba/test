package com.itheima;

import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

/**
 * @Author: zh
 * @Date: 2019/5/20 10:31
 */
public class CreateJwt {
    public static void main(String[] args) {


        ArrayList<Object> list1 = new ArrayList<>();
        ArrayList<Object> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(2);
        list2.add(3);
        boolean b = list1.addAll(list2);



        list1.addAll(list2);


        list1.addAll(1,list2);


        System.out.println(list1.remove(3));
        System.out.println(list1);





    }
}

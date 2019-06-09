package com.itheima;

import java.nio.file.attribute.UserDefinedFileAttributeView;
import java.util.*;

/**
 * @Author: zh
 * @Date: 2019/5/19 10:08
 */
public class TestMap {
    public static void main(String[] args) {
        HashMap<Integer, User> userMap = new HashMap<>();
        userMap.put(8,new User("张飞",89));
        userMap.put(2,new User("李广",766));
        userMap.put(5,new User("张郃",1798));
        userMap.put(4,new User("李世民",128));
        userMap.put(1,new User("刘邦",90));
        System.out.println(userMap);

        HashMap<Integer, User> sortMap = sortMap(userMap);



        System.out.println(sortMap);








    }

    public static HashMap<Integer,User> sortMap(HashMap<Integer,User> map) {
        Set<Map.Entry<Integer, User>> entries = map.entrySet();
        ArrayList<Map.Entry<Integer, User>> list = new ArrayList<>(entries);
        Collections.sort(list, new Comparator<Map.Entry<Integer, User>>() {
            @Override
            public int compare(Map.Entry<Integer, User> o1, Map.Entry<Integer, User> o2) {
                return o2.getValue().getAge() - o1.getValue().getAge();
            }
        });

        //创建要给有序map linkedHashMap

        LinkedHashMap<Integer, User> linkedMap = new LinkedHashMap<>();
        for (Map.Entry<Integer, User> entry : list) {
            linkedMap.put(entry.getKey(),entry.getValue());
        }
        return linkedMap;
        


    }
    public int test(){
        System.out.println("公共方法，非静态");
        return 1;
    }
}

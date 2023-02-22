package com.hansunping_secondstage.list_;

import java.util.ArrayList;
import java.util.List;

public class ListExercise {
    public static void main(String[] args) {
        //添加10个以上的元素（比如String"hello"），
        // 在2号位插入一个元素“韩顺平教育”，
        // 获得第5个元素，删除第6个元素，
        // 修改第7个元素，在使用迭代遍历集合，
        // 要求：使用List的实现类ArrayList完成。


        List list = new ArrayList();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        list.add("6");
        list.add("7");
        list.add("8");
        list.add("9");
        list.add("10");

//在2号位插入一个元素
        list.add(1, "韩顺平教育");

        //获得第5个元素
        System.out.println(list.get(5));

        //删除第6个元素
        list.remove(6);


        //修改第7个元素
        list.set(7, 123);
        for (Object list1 : list) {
            System.out.println(list1);
        }


    }
}

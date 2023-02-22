package com.hansunping_secondstage.list_;

import java.util.ArrayList;
import java.util.List;

public class ListMethod {
    public static void main(String[] args) {
        //List接口方法

        List list = new ArrayList();
        list.add("张三丰");
        list.add("贾宝玉");


        //void add(int index, Object ele)：在index位置插入ele元素
        //在index = 1的位置插入一个对象
        list.add(1, "韩顺平");

        System.out.println(list);


        List list2 = new ArrayList();
        list2.add("jack");
        list2.add("tom");

        list.add("贾宝玉");

//        boolean addAll(int index, Collection eles):从index位置开始将eles中的所有元素添加进来

        list.addAll(1, list2);

        System.out.println(list);


//        Object get(int index):获取指定index位置的元素
        System.out.println(list.get(0));

        //int indexof(object obj)  :返回obj 在集合中首次出现的位置
        System.out.println(list.indexOf("tom"));


//        int lastIndexof(Object obj):返回obj在当前集合中未次出现的位置
        System.out.println(list.lastIndexOf("贾宝玉"));


//        Object remove(int index):移除指定index位置的元素，并返回元素
        list.remove(0);
        System.out.println("list=" + list);


//        Object set(int index,Object ele): 设置指定index位置的元素为ele,相当于是替换。
        list.set(1, "玛丽");
        System.out.println("list=" + list);


//        List subList(int fromIndex,int toIndex):返回从fromIndex到toIndex位置的子集合
        System.out.println("returnList=" + list.subList(2, 4));

    }
}

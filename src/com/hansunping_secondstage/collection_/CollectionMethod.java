package com.hansunping_secondstage.collection_;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollectionMethod {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {

        List list = new ArrayList();
        //添加单个元素
        list.add("jack");
        list.add(10);
        list.add(true);

        System.out.println("list=" + list);
        //删除指定元素
//        list.remove("jack");   //指定删除某个元素
//        System.out.println(list.remove(0));   //删除第一个元素，并返回所删除的是什么元素

        System.out.println("list=" + list);


        //contains:查找元素是否存在
        System.out.println(list.contains("jack"));

        //size 获取元素的个数
        System.out.println(list.size());

        //isEmpty：判断是否为空
        System.out.println(list.isEmpty());

        //clear:清空 把集合时的元素全部清空
        list.clear();
        System.out.println(list);


        //addAll:添加多个元素
        ArrayList arrayList = new ArrayList();
        arrayList.add("红楼梦");
        arrayList.add("三国演义");
        list.addAll(arrayList);
        System.out.println(list);


        //containsAll:查找多个元素是否都存在
        System.out.println(list.containsAll(arrayList));

        list.add("聊斋");
        //删除多个元素
        list.removeAll(arrayList);
        System.out.println(list);


        Iterator iterator = list.iterator();


        while (iterator.hasNext() == true){
            System.out.println(iterator.next());
        }


    }
}

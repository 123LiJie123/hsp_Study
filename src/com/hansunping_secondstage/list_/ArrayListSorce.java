package com.hansunping_secondstage.list_;

import java.util.ArrayList;

public class ArrayListSorce {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();


        //使用无参构造器创建ArrayList对象
        //使用for给list集合添加 1-10数据
        for (int i = 1; i <= 10; i++) {
            list.add(i);
        }

        //使用for给list集合添加 11-15数据
        for (int i = 11; i <= 15; i++) {
            list.add(i);
        }

        list.add(100);
        list.add(200);
        list.add(null);
    }
}


package com.hansunping_secondstage.list_;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListFor {
    public static void main(String[] args) {
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
        //方式一：使用iterator
        Iterator iterator = list.iterator();

        System.out.println("\n使用Iterator:");

        while (iterator.hasNext()) {
            System.out.print(iterator.next() + "\t");
        }

        //方式二：使用增强for
        System.out.println("\n使用增强for:");
        for (Object a :
                list) {
            System.out.print(a + "\t");
        }

        //方式三：使用普通for

        System.out.println("\n使用普通for");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + "\t");
        }
    }
}

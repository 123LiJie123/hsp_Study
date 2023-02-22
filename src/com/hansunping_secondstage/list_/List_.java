package com.hansunping_secondstage.list_;


import java.util.ArrayList;
import java.util.List;

public class List_ {
    public static void main(String[] args) {
        //List集合类中元素有序（即添加顺序和取出顺序一致）、且可重复
        List List = new ArrayList();
        List.add("jack");
        List.add("tom");
        List.add("mary");
        List.add("hsp");
        List.add("tom");

        System.out.println(List);


//        List集合中的每个元素都有其对应的顺序索引，即支持索引。

    }
}

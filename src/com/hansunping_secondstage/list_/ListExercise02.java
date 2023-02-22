package com.hansunping_secondstage.list_;

import java.util.ArrayList;

import java.util.List;

public class ListExercise02 {
    //使用List的实现类添加三本图书，并遍历，打印如下效果

    //名称： xx     价格：xx   作者：xx
    //名称： xx     价格：xx   作者：xx
    //名称： xx     价格：xx   作者：xx


    /*
    要求：
    按价格排序，从低到高（使用冒泡法）
    要求使用ArrayList、LinkedList和Vector三种集合实现
     */

    public static void main(String[] args) {

        Book book1 = new Book("红楼梦", "曹雪芹", 100);
        Book book2 = new Book("西游记", "吴承恩", 10);
        Book book3 = new Book("红楼梦", "曹雪芹", 110);

        List list = new ArrayList();
        list.add(book1);
        list.add(book2);
        list.add(book3);
        //从低到高
        for (int i = 0; i < list.size(); i++) {
            for (int j = i; j < list.size() - 1; j++) {
                if (((Book) list.get(j)).price > ((Book) list.get(j + 1)).price) {
                    Book book = (Book) list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, book);
                }
            }
        }

        for (Object obj :
                list) {
            System.out.println(obj);
        }
    }
}


class Book {
    String name;
    double price;
    String author;

    public Book(String name, String author, double price) {
        this.name = name;
        this.price = price;
        this.author = author;
    }

    @Override
    public String toString() {
        return "名称：" + name + "\t价格：" + price + "\t作者：" + author;
    }
}

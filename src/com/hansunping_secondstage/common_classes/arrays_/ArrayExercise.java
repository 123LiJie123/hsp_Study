package com.hansunping_secondstage.common_classes.arrays_;

import java.util.Arrays;
import java.util.Comparator;

public class ArrayExercise {
    //自定义Book类，里面包含name和price，按price排序（从大到小）。要求使用两种方式排序，
    //对对象的某个属性排序，有一个Book[]books = 5本书对象。
    public static void main(String[] args) {
        Book[] books = new Book[5];
        books[0] = new Book("红楼梦~", 100);
        books[1] = new Book("金瓶梅~", 90);
        books[2] = new Book("青年文摘~", 5);
        books[3] = new Book("java从入门到放弃~", 300);
        books[4] = new Book("三国演义", 29);


        System.out.println("按照price从大到小排序：");
        Arrays.sort(books, new Comparator<Book>() {
            @Override
            public int compare(Book book01, Book book02) {
                int i1 = book02.price - book01.price;
                return i1;
            }
        });
        System.out.println(Arrays.toString(books));


        System.out.println("按照price从小到大排序：");
        Arrays.sort(books, new Comparator<Book>() {
            @Override
            public int compare(Book book01, Book book02) {
                int i1 = book01.price - book02.price;
                return i1;
            }
        });

        System.out.println(Arrays.toString(books));


        System.out.println("按照书名长度从大到小排序：");
        Arrays.sort(books, new Comparator<Book>() {
            @Override
            public int compare(Book book01, Book book02) {
                int i1 = book02.name.length() - book01.name.length();
                return i1;
            }
        });

        System.out.println(Arrays.toString(books));
    }

}


class Book {
    String name;
    int price;

    public Book(String name, int price) {
        this.name = name;
        this.price = price;
    }


    @Override
    public String toString() {
        return "name：" + name + "-price：" + price + "\n";
    }
}

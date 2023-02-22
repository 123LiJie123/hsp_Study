package com.hansunping_secondstage.collection_;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;


@SuppressWarnings({"all"})
public class CollectionIterator {
    public static void main(String[] args) {

        Collection collection = new ArrayList();
        collection.add(new Book("三国演义", "罗贯中", 10.1));
        collection.add(new Book("小李飞刀", "古龙", 5.1));
        collection.add(new Book("红楼梦", "曹雪芹", 34.6));


        System.out.println("col=" + collection);


        //先得到col对应的迭代器


        Iterator iterator = collection.iterator();

        while (iterator.hasNext()) {
            //返回下一下元素，类型是Object
            Object obj = iterator.next();
            System.out.println("obj=" + obj);

        }

        System.out.println("=============================");
        //使用增强for,在collection集合
        for (Object o : collection) {
            System.out.println(o);
        }

        //增强for，也可以直接在数组中使用
        //增加for，底层仍然是迭代器
        //增强for可以理解成就是简化版本的 迭代器
        int[] nums = {1, 8, 10, 90};
        for (int i : nums) {
            System.out.println(i);
        }



    }
}

class Book {
    private String name;
    private String author;
    private double price;

    public Book(String name, String author, double price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }
}

package com.hansunping_secondstage.generic_;

import java.util.*;

public class GenericExercise {

    //泛型在HashSet,HashMap的使用情况。

    /*
    1、创建3个学生对象
    2、放入到HashMap中，要求Key是String name,Value就是学生对象
    3、使用两种方式遍历
     */
    public static void main(String[] args) {
        //1、HashSet （HashSet是无序且不会有重复）
        HashSet<Student> set = new HashSet<Student>();
        Student student1 = new Student("John", 12);
        set.add(student1);
        set.add(student1);
        set.add(new Student("lusi", 13));
        Iterator<Student> iterator01 = set.iterator();
        System.out.println("遍历方式一：");
        while (iterator01.hasNext()) {
            Student student = iterator01.next();
            System.out.println(student);
        }
        System.out.println("遍历方式二：");
        for (Student stu :
                set) {
            System.out.println(stu);
        }


        HashMap<String, Student> hm = new HashMap<>();
        hm.put("milan", new Student("milan", 38));
        hm.put("smith", new Student("smith", 48));
        hm.put("hsp", new Student("hsp", 28));

        System.out.println("==========================================");
        //迭代器  EntrySet
        Set<Map.Entry<String, Student>> entries = hm.entrySet();
        Iterator<Map.Entry<String, Student>> iterator = entries.iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Student> next = iterator.next();
            System.out.println(next.getKey() + ":" + next.getValue());

        }


    }
}

class Student {
    public String name;
    public int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + "--" + age;
    }
}

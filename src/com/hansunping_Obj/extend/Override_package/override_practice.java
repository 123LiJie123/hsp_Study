package com.hansunping_Obj.extend.Override_package;

public class override_practice {
    public static void main(String[] args) {
        Person person = new Person("波波",22);
        System.out.println(person.say());
        Student student = new Student("小波子",22,"0123",90);
        System.out.println( student.say());
    }
}

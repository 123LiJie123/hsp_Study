package com.hansunping_firstStage;

public class TestPerson {
    public static void main(String[] args) {
        Person person = new Person("li",12);
        Person person1 = new Person("li",13);
        Person person2 = new Person("li",12);
        if (person.compareto(person1)){
            System.out.println("person和person1是同一人");
        }
        if (person.compareto(person2)){
            System.out.println("person和person2是同一人");
        }
    }

}
class Person{
    String name;
    int age;
    public Person(String name,int age){
        this.name = name;
        this.age = age;
    }
    public boolean compareto(Person person){
        if(this.name.equals(person.name)&&this.age==person.age){
            return true;
        }
        return false;
    }
}

package com.hansunping_Obj.polymorphic.polyarr;

public class PolyArry {
    public static void main(String[] args) {
// 应用实例：现有一个继承结构如下：要求创建1个Person对象，
// 2个Student对象和2个Teacher对象，统一放在数组中，并调用say方法。

      Person[] persons = new Person[5];
      persons[0] = new Person("jack",20);
      persons[1] = new Student("jack",18,100);
      persons[2] = new Student("smith",19,30.1);
      persons[3] = new Student("scott",30,20000);
      persons[4] = new Student("king",50,25000);


        for (int i = 0; i < persons.length; i++) {
            System.out.println(persons[i].say());   //动态绑定机制
            if (persons[i]instanceof Student){ //判断persions[i]的运行类型是不是Student类型
              Student student = (Student)persons[i];     //((Student)persons[i]).study;
              student.study();
            }else if (persons[i]instanceof Teacher){  //判断persions[i]的运行类型是不是Teacher类型
                Teacher teacher = (Teacher) persons[i];   // ((Teacher) persons[i]).teach();
                teacher.teach();

            }else {
                persons[i].p();
            }
        }

    }
}

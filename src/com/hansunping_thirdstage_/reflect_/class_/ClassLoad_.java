package com.hansunping_thirdstage_.reflect_.class_;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class ClassLoad_ {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入key");

        String key = scanner.next();

        switch (key) {
            case "1":

                //静态加载
//                Dog dog = new Dog();
//                dog.cry();


                //因为new Dog()是静态加载，因此必须编写Dog
                break;
            case "2":
                //反射--->动态加载
                Class<?> cls = Class.forName("Person");
                Object o = cls.newInstance();
                Method hi = cls.getMethod("hi");
                hi.invoke(o);
                System.out.println("ok");
                //Person类是动态加载，所以，没有编写Person类也不会报错，只有当动态加载该类时，才会报错
                break;

            default:
                System.out.println("do nothing...");
        }
    }
}

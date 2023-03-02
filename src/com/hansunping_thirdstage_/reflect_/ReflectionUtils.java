package com.hansunping_thirdstage_.reflect_;

import org.junit.Test;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionUtils {
    public static void main(String[] args) {


    }


    //第一组方法API
    @Test
    public void api_01() throws ClassNotFoundException, NoSuchMethodException {
        //得到Class对象
        Class<?> personcls = Class.forName("com.hansunping_thirdstage_.reflect_.Person");
        //1、getName：获取全类名
        System.out.println(personcls.getName());
        System.out.println();
        System.out.println();
        //2、获取简单类名：getSimpleName
        System.out.println(personcls.getSimpleName());
        System.out.println();
        System.out.println();
        //3、获取所有public修饰的属性，包含本类以及父类的
        Field[] fields = personcls.getFields();
        for (Field field : fields) {
            System.out.println(field.getName());
        }
        System.out.println();
        System.out.println();
        //4、getDeclareFields：获取本类中所有属性
        Field[] declaredFields = personcls.getDeclaredFields();
        for (Field declareField : declaredFields) {
            System.out.println("本类中所有属性=" + declareField.getName());
        }
        System.out.println();
        System.out.println();
//        5. getMethods:获取所有public修饰的方法，包含本类以及父类
        Method[] methods = personcls.getMethods();
        for (Method method : methods) {
            System.out.println("本类及父类的方法" + method);
        }
        System.out.println();
        System.out.println();
//        6. getDeclaredMethods:获取本类中所有方法
        Method[] declareMethods = personcls.getDeclaredMethods();
        for (Method method : declareMethods) {
            System.out.println("本类及父类的方法" + method);
        }
        System.out.println();
        System.out.println();
//        7. getConstructors:获取本类所有public修饰的构造器
        Constructor<?>[] constructors = personcls.getConstructors();
        for (Constructor constructor : constructors) {
            System.out.println("本类所有公共的构造器" + constructor.getName());
        }
        System.out.println();
        System.out.println();
//        8. getDeclaredConstructors:获取本类中所有构造器
        Constructor<?>[] declaredconstructors = personcls.getDeclaredConstructors();
        for (Constructor constructor : declaredconstructors) {
            System.out.println("本类及父类的构造器" + constructor.getName());
        }
        System.out.println();
        System.out.println();
//        9. getPackage:以Package形式返回包信息
        System.out.println(personcls.getPackage());
        System.out.println();
        System.out.println();
//        10.getSuperClass:以Class形式返回父类信息
        System.out.println("父类的class对象=" + personcls.getSuperclass());
        System.out.println();
        System.out.println();
//        11.getinterfaces:以Class[]形式返回接口信息
        Class<?>[] interfaces = personcls.getInterfaces();
        for (Class<?> anInterface : interfaces) {
            System.out.println("接口信息=" + anInterface);
        }
        System.out.println();
        System.out.println();
//        12.getAnnotations:以Annotation[] 形式返回注解信息
        Annotation[] annotations = personcls.getAnnotations();
        for (Annotation annotation : annotations) {
            System.out.println("注解信息=" + annotation);
        }
        System.out.println();
        System.out.println();

    }

    @Test
    public void api_02() throws ClassNotFoundException {
        Class<?> personcls = Class.forName("com.hansunping_thirdstage_.reflect_.Person");
        Field[] declaredFields = personcls.getDeclaredFields();
        for (Field declareField : declaredFields) {
            System.out.println("本类中所有属性=" + declareField.getName() + "该属性的修饰符值=" + declareField.getModifiers());
        }
    }
}

class A {
    public String hobby;

    public void hi() {

    }
}

interface IA {

}

interface IB {

}

@Deprecated
class Person extends A implements IA, IB {
    //属性
    public String name;
    protected int age;
    String job;
    private double sal;

    public Person() {

    }

    public Person(String name) {

    }

    //方法
    public void m1() {

    }

    protected void m2() {

    }

    void m3() {

    }

    private void m4() {

    }
}

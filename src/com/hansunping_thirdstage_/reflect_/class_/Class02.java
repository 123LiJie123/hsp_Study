package com.hansunping_thirdstage_.reflect_.class_;

import java.lang.reflect.Field;

/**
 * 演示Class类的常用方法
 */
public class Class02 {
    public static void main(String[] args) {
        String classAllPath = "com.hansunping_thirdstage_.reflect_.class_.Car";
        //获取到Car类对应的Class对象

        try {


            //1、获取到Car类对应的Class对象
            //<?>表示不确定的Java类型
            Class<?> carClass = Class.forName(classAllPath);


            //2、输出carClass
            //显示carClass对象，是哪个类的Class对象 com.hspedu.Car
            System.out.println(carClass);
            //输出carClass运行类型 java.lang.Class
            System.out.println(carClass.getClass());


            //3、得到包名
            System.out.println(carClass.getPackage().getName());


            //4、得到全类名
            System.out.println(carClass.getName());


            //5、通过carClass创建对象实例
            Car car = (Car) carClass.newInstance();
            System.out.println(car);


            //6、 通过反射获取属性brand,只能获取公有属性
            Field brand = carClass.getField("brand");
            System.out.println(brand.get(car));

            //7、通过反射给属性赋值
            brand.set(car, "奔驰");
            System.out.println(brand.get(car));


            //8、通过carClass得到car中所有属性
            Field[] fields = carClass.getFields();
            for (int i = 0; i < fields.length; i++) {
                System.out.println(fields[i].get(car));
            }


        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }

    }
}

package com.hansunping_secondstage.enum_;

public class EnumMethod {
    public static void main(String[] args) {
        //使用Season2、枚举类，来演示各种方法
        Season01 spring = Season01.SPRING;
        Season01 summer = Season01.SUMMER;
        //输出枚举对象名字
        System.out.println(spring.name());

        //ordinal()输出的是该枚举对象的次序/编号， 从0开始编号
        System.out.println(spring.ordinal());
        System.out.println(summer.ordinal());


        //从反编译可以看出values方法，返回Season2[]
        //含有定义的所有枚举对象
        Season01[] values = Season01.values();


        //增强for循环
        for (Season01 season01 : values) {
            System.out.println(season01);
        }

        //valueof:将字符串转换成枚举对象，要求字符串必须转换为已有的常量名，否则报异常
        /*
        执行流程
        1、根据你输入的"AUTUMN"到Season01的枚举对象去查找
        2、如果找到了，就返回，如果没有找到，就报错
         */
        Season01 season01 = Season01.valueOf("SPRING");
        System.out.println(season01 == spring);


        //compareTO：比较两个枚举常量，比较的就是编号！
        System.out.println(Season01.SUMMER.compareTo(Season01.SPRING));


    }
}

package com.hansunping_secondstage.enum_;

public class EnumExercise02 {

    /*
    (1)声明Week枚举类，其中包含星期一至星期日的定义；
    MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY,SUNDAY;
    (2)使用values返回所有的枚举数组，并遍历，输出效果
     */

    public static void main(String[] args) {

        System.out.println("=====所有星期的信息如下=====");
        Week[] week = Week.values();
        for (Week va : week) {
            System.out.print(va);
        }


    }


}


enum Week {
    MONDAY("星期一"),
    TUESDAY("星期二"),
    WEDNESDAY("星期三"),
    THURSDAY("星期四"),
    FRIDAY("星期五"),
    SATURDAY("星期六"),
    SUNDAY("星期日");
    String name;

    Week(String name) {
        this.name = name;
    }


    public String toString() {
        return name + '\n';
    }
}

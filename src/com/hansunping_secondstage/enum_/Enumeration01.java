package com.hansunping_secondstage.enum_;

public class Enumeration01 {
    /*
    需求创建季节（Season）对象，请设计完成。
     */

    public static void main(String[] args) {
        Season spring = new Season("春", "温暖");
        Season summer = new Season("夏", "炎热");
        Season aut = new Season("秋", "凉爽");
        Season winn = new Season("冬", "寒冷");
        Season season = new Season("xxx", "xxx");

        //这样设计并不好 不能体现季节是固定的四个对象，所以就需要枚举类


    }

}

class Season {
    private String name;
    private String desc;//描述

    public Season(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}

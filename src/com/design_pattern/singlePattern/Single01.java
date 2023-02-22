package com.design_pattern.singlePattern;

public class Single01 {

    public static void main(String[] args) {
        GirlFriend girlFriend = GirlFriend.getInstance();

        GirlFriend girlFriend01 = GirlFriend.getInstance();

        System.out.println(girlFriend.getName());

        System.out.println(girlFriend+"//////"+girlFriend01);


    }
}

//有一个类，GirlFriend
//只能有一个女朋友

class GirlFriend{
    //饿汉式
    private String name;
    static GirlFriend girlFriend = new GirlFriend("小花");
    private GirlFriend(String naem){
    this.name = name;
    }



    public static GirlFriend getInstance(){
        return girlFriend;
    }


    public String getName(){
        return "小花";
    }
}
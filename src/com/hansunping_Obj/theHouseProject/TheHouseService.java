package com.hansunping_Obj.theHouseProject;

public class TheHouseService {
/*
1、响应TheHouseView的调用
2、完成对房屋信息的各种操作（CRUD）
 */





    public House[] addHouseinfo(int anInt,String name, String phone, String address, int rent, String conditon,House[] houses ) {
        houses[anInt] = new House(anInt+1, name, phone, address, rent, conditon);
        return houses;
    }


    public void seekHous(int find,House[] house){
        System.out.println(find+"\t"+house[find].getName()+"\t"+house[find].getPhone()+"\t"+house[find].getRent()+"\t"+house[find].getCondition());
    }

    public void deleteHous(){

    }

}

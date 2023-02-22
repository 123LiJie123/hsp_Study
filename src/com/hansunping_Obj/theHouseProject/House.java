package com.hansunping_Obj.theHouseProject;

public class House {

    /*
    1、一个House对象表示一个房屋信息
     */

    private int id;
    private String name;
    private String phone;
    private String address;
    private int rent;
    private String condition;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getRent() {
        return rent;
    }

    public void setRent(int rent) {
        this.rent = rent;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public House(int id, String name, String phone, String address, int rent, String condition) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.rent = rent;
        this.condition = condition;
    }
}

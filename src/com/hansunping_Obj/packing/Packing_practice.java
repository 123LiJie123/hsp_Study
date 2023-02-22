package com.hansunping_Obj.packing;

public class Packing_practice {
    //课堂练习题：
    /*
    1、Account类要求具有属性：姓名（长度为2位3位或4位）、余额（必须>20）、密码（必须是六位），
    如果不满足，则给出提示信息，并给默认值。
    2、通过setXxx的方法给Account的属性赋值。
    3、在AccountTest中测试。

     */

    public static void main(String[] args) {
        Account account = new Account();
        account.setName("s");
        account.setBalance(100);
        account.setPwd("123456");

        account.info();
    }
   
}

class Account{
    private String name;
    private int balance;
    private String pwd;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length()>=2&&name.length()<=4){
            this.name = name;
        }else {
            System.out.println("不符合要求，重新输入");
        }
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        if (balance>20){
            this.balance = balance;
        }else {
            System.out.println("不符合要求，重新输入");
        }

    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        if (pwd.length()==6){
            this.pwd = pwd;
        }else {
            System.out.println("不符合要求，重新输入");
        }
    }

    public void info(){
        System.out.println("姓名:"+ getName()+"  余额："+getBalance()+"  密码:"+getPwd());
    }
}

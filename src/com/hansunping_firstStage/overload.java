package com.hansunping_firstStage;

public class overload {
    public static void main(String []args){

overload o = new overload();
        o.m(8);
        o.m(8,2);
        o.m("三overload");

    }

    public void m(int k){
        System.out.println(k*k);
    }
    public void m(int k,int j){
        System.out.println(k*j);
    }
    public void m(String str){
        System.out.println(str);
    }
}

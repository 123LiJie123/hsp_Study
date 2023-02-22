package com.hansunping_secondstage.generic_.customGeneric_;

public class CustomGeneric02 {
    //自定义泛型接口
    public static void main(String[] args) {

    }
}

interface IUsb<U, R> {
    //普通方法中，可以使用接口泛型


    R get(R r);

    void hi(R r);

    void run(R r1, R r2, U u1, U u2);

    //在jdk8中，可以在接口中，使用默认方法
    default R Method(U u) {
        return null;
    }

}

class IA implements IUsb<String, Double> {

    @Override
    public Double get(Double aDouble) {
        return null;
    }

    @Override
    public void hi(Double aDouble) {

    }

    @Override
    public void run(Double r1, Double r2, String u1, String u2) {

    }
}

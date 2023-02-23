package com.hansunping_thirdstage_.reflect_.class_;

import java.io.Serializable;

public class AllTypeClass {
    public static void main(String[] args) {

        Class<String> cls1 = String.class;   //基本类
        Class<Serializable> cls2 = Serializable.class; //接口
        Class<Integer[]> aClass = Integer[].class;   //数组
        Class<float[][]> aClass1 = float[][].class;  //二维数组
        Class<Deprecated> deprecatedClass = Deprecated.class;   //注解
        Class<Thread.State> stateClass = Thread.State.class;// 枚举
    }
}

package com.design_pattern.templatePattern;

public class TestTemplate {
    //模板设计模式
    public static void main(String[] args) {


        AA aa = new AA();
        aa.calculateTime();

        BB bb = new BB();
        bb.calculateTime();
    }
}


class AA extends Template {

    //计算任务
    // 1+……10000
    public void job() {
        int num = 0;
        for (int i = 0; i < 800000; i++) {
            num += i;
        }
    }


}

class BB extends Template {
    //计算任务
    // 1+……10000
    public void job() {
        int num = 0;
        for (int i = 0; i < 800000; i++) {
            num += i;
        }
    }
}


abstract class Template {

    //模板设计模式
    public abstract void job();

    public void calculateTime() {

        //得到开始的时间
        long start = System.currentTimeMillis();

        job();  //动态绑定机制

        //得到结束的时间
        long end = System.currentTimeMillis();

        System.out.println("执行时间" + (end - start));
    }

}

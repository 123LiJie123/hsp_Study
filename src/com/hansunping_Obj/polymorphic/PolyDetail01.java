package com.hansunping_Obj.polymorphic;

public class PolyDetail01{
    public static void main(String[] args) {
        Base sub = new Sub();
        System.out.println(sub.count);   //此时输出的结果是10
        //在继承关系中属性没有重写之说！属性的值看编译类型！
        System.out.println(sub.getCount());
    }

}

class Base{  //父类
    int count = 10;
    public int  getCount(){
        return count;
    }
}
class Sub extends Base{   //子类
    int count = 20;
    @Override
    public int getCount() {
        return super.getCount();
    }
}

package com.hansunping_Obj.interface_;

public class InterfaceExercise02 {
    public static void main(String[] args) {
        new C().pX();
    }
}


interface AA{
    int x = 0;
}
class B{
    int x = 1;
}

class C extends  B implements AA{
    public void pX(){
        //访问接口的x就使用AA.x 访问父类的x可以使用super.x
        System.out.println(AA.x+" " + super.x);
    }
}
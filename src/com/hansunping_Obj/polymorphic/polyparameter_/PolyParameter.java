package com.hansunping_Obj.polymorphic.polyparameter_;

public class PolyParameter {
    /*

        测试类中添加一个方法showEmpAnnal(Employee e),实现获取任何员工对象的年工资，并在main方法中调用
        该方法[e.getAnnual()]

        测试类中添加一个方法，testWork，如果是普通员工，则调用work方法，如果是经理，则调用manage方法。
     */
    public static void main(String[] args) {
        Worker tom = new Worker("tom", 2500);
        Manager milan = new Manager("milan", 5000, 200000);
        PolyParameter p = new PolyParameter();
        p.showEmpAnnal(tom);
        p.showEmpAnnal(milan);


    }


    public void showEmpAnnal(Employee e){
        System.out.println(e.getAnnual()  );
        testWork(e);
    }

    public void testWork(Employee e){
        if (e instanceof Worker){
            ((Worker)e).wrok();
        }else if (e instanceof Manager){
            ((Manager)e).manage();
        }
    }
}

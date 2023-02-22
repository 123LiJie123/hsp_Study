package com.hansunping_secondstage.generic_;





import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Comparator;

public class Generic_priactice {

    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<Employee>();
        employees.add(new Employee("aa", 10000, new MyDate("11", "23", "2001")));
        employees.add(new Employee("abc", 12000, new MyDate("10", "21", "2001")));
        employees.add(new Employee("aa", 8000, new MyDate("12", "11", "2001")));

        employees.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                if (!(o1 instanceof Employee && o2 instanceof Employee)) {
                    return 0;
                }

                //比较name
                int i = o1.getName().compareTo(o2.getName());
                if (i != 0) {
                    System.out.println(i);
                    return i;
                }
                //下面是对birthday的比较
                int i1 = o1.getBirthday().toString().compareTo(o2.getBirthday().toString());
                if (i1 != 0) {
                    System.out.println("i1="+i1);
                    return i1;
                }
                return 0;
            }
        });


        for (Employee e :
                employees) {
            System.out.println(e);
        }
    }

}

class Employee {
    private String name;
    private double sal;
    private MyDate birthday;

    public Employee(String name, double sal, MyDate birthday) {
        this.name = name;
        this.sal = sal;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

@Test
    public void setName(String name) {
        this.name = name;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    public MyDate getBirthday() {
        return birthday;
    }

    public void setBirthday(MyDate birthday) {
        this.birthday = birthday;
    }

    @Override

    public String toString() {
        return "name:" + name
                + "\tsal:" + sal
                + "\tbirthday:" + birthday;
    }
}

class MyDate {
    String month;
    String day;
    String year;

    public MyDate(String month, String day, String year) {
        this.month = month;
        this.day = day;
        this.year = year;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getDate() {
        return year + '-' + month + '-' + day;
    }

    @Override
    public String toString() {
        return year + '-' + month + '-' + day;
    }
}

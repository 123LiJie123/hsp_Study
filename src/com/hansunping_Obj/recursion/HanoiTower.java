package com.hansunping_Obj.recursion;

public class HanoiTower {
    public static void main(String[] args) {
        //汉诺塔问题
        Tower tower = new Tower();
        tower.movie(3, 'A', 'B', 'C');


    }
}

class Tower {
    public void movie(int num, char a, char b, char c) {
        /*
        可以把A塔分两部分：一、上面部分 二、最底层
        如果A塔只有最底层则直接将A塔上的盘移到C塔
        否则先将A塔上的盘移动到B塔上，最后将A塔上的最底盘移到C塔
        再将B塔上的盘移动到C塔。
         */
        if (num == 1) {
            System.out.println(a + "->" + c);
        } else {
            movie(num - 1, a, c, b);
            System.out.println(a + "->" + c);
            movie(num - 1, b, a, c);
        }
    }

}
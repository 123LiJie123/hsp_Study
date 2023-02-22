package com.hansunping_firstStage;

/*
       递归调用应用实例-迷宫问题
       1.小球得到的路径，和程序员设置的找路策略有关即：找路的上下左右的顺序相关
       2.再得到小球路径时，可以先使用(下右上左)，再改成（上右下左），看看路径是不是有变化
       3.测试回溯现象
       4.扩展思考：如何求出最短路径？
        */
public class miGong {

    //编写一个main函数
    public static void main(String[] args) {
        //思路
        //1.先创建迷宫，用二维数组表示 int[][] map = new int[8][7];
        //2.先规定map数组的元素值： 0表示可以走  1表示障碍物

        int[][] map = new int[8][7];

        //将最上面的一行和最下面的一行，全部设置为1
        for (int i = 0; i < 7; i++) {
            map[0][i] = 1;
            map[7][i] = 1;
        }
        //将最左面的一列和最右面的一列全部设置为1
        for (int i = 0; i < map.length; i++) {
            map[i][0] = 1;
            map[i][map[i].length - 1] = 1;
        }
        map[3][1] = 1;
        map[3][2] = 1;
        map[2][1] = 1;
//        map[2][2] = 1;
//        map[1][2] = 1;

        //输出当前的地图
        System.out.println("输出当前地图：");
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                System.out.print(map[i][j] + "");//输出一行
            }
            System.out.println();
        }

//使用findWay给老鼠找路
        T t1 = new T();
        t1.findway(map, 1, 1);
        //输出找路情况
        System.out.println("找路情况如下");
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                System.out.print(map[i][j] + "");
            }
            System.out.println();
        }
    }

}

class T {
    //使用递归回溯的思想来解决老鼠出迷宫

    //解读
    //1.findway方法就是专门来找出迷宫的路径
    //2.如果找到，就返回true,false
    //3.map就是二维数组，即表示迷宫
    //4.i,j就是老鼠的位置，初始化的位置为（1，1）
    //5.因为我们是递归找路，所以我先规定map数组各个值的含义
    // 0表示可以走 1表示障碍物 2表示可以走 3表示走过，但是走不通是死路
    //6. 当map[6][5] == 2就说明找到通路，就可以结束否则继续找。
    //7、 先确定老鼠找路策略。 下->右->上->左
    public boolean findway(int[][] map, int i, int j) {
        if (map[6][5] == 2) {
            //说明已经找到路了
            return true;
        } else {
            if (map[i][j] == 0) { //当前这个位置0,说明表示可以走
                //我们假定可以走通
                map[i][j] = 2;
                //使用找路策略，来确定该位置是否真的可以走通
                //下->右->上->右
                if (findway(map, i + 1, j)) {//先向下走
                    return true;
                } else if (findway(map, i, j + 1)) {//向右走
                    return true;
                } else if (findway(map, i - 1, j)) { //向上走
                    return true;
                } else if (findway(map, i, j - 1)) { //向左走
                    return true;
                } else {
                    //如果找路策略走不通的路则设置为3
                    map[i][j] = 3;
                    return false;
                }
            } else {
                return false;
            }
        }
    }
}
package Gui_Swing_Manage.Gui_Study;

import javax.swing.*;
import java.awt.*;

public class DrawCircle extends JFrame {   //JFrame对应窗口，可以理解成是一个画框
    private MyPanel myPanel = null;

    public static void main(String[] args) {

//定义一个画框
        DrawCircle drawCircle = new DrawCircle();


    }


    public DrawCircle() {
//初始化面板
        myPanel = new MyPanel();
        //把面板放入到窗口
        this.add(myPanel);
        this.setSize(400, 300);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);//使其可以显示
    }
}

//1、先定义一个MyPanel,继承JPanel类，画图形就在面板上画

class MyPanel extends JPanel {


    //1、MyPanel 对象就是一个画板（面板）
    //2、Graphics g  把 g 理解成一支画笔
    //3、 Graphics 提供了很多绘图的方法
    //
    @Override
    public void paint(Graphics g) {
        //绘图的方法
        super.paint(g);

//        System.out.println("Paint方法被调用了");

        g.drawOval(20, 20, 50, 50);


        //演示绘制不同的图形
        //1、画直线
        g.drawLine(10, 10, 100, 100);

        //2、画矩形边框
        g.drawRect(110, 110, 20, 30);

        //3、画椭圆边框
        g.drawOval(20, 20, 50, 50);

        //4、填充矩形
        g.fillRect(120, 120, 30, 20);

        //5、设置画笔的颜色
        g.setColor(Color.blue);
        g.fillRect(120, 120, 30, 20);

        //6、填充椭圆
        g.fillOval(20, 20, 50, 50);

        //7、画图片
        //这个方式只能画png图片
        //获取图片资源
        Image image = Toolkit.getDefaultToolkit().getImage(Panel.class.getResource("/SATA.png"));
        g.drawImage(image, 10, 10, 175, 221, this);


        //画字符串
        g.drawString("JAVA很难", 0, 0);
        //给画笔设置颜色和字体
        g.setColor(Color.MAGENTA); // 设置颜色
        g.setFont(new Font("隶书", Font.PLAIN, 50)); //设置字体
        g.drawString("北京你好", 10, 10);  //这里的坐标是左下角


    }
}

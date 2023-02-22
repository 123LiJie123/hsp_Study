package com.tankgame_.tankgame1_0;

import java.awt.*;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class Tank {
    String filePath = "src\\tank.properties";
    static int count = 0;
    int id;
    static Properties properties = new Properties();

    private int x;  //坦克的横坐标
    private int y; //坦克的纵坐标
    private int speed = 1;
    private int direct;
    static FileWriter fileWriter;

    public int getDirect() {
        return direct;
    }

    public void setDirect(int direct) {
        this.direct = direct;
    }

    public Tank(int x, int y) {
        this.x = x;
        this.y = y;
        try {
            properties.load(new FileReader(filePath));
            fileWriter = new FileWriter(filePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
        id = count++;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void moveUP() {
        if (y > 0) {
            y -= speed;
            if (this != null && this.getClass() != Hero.class) {
                System.out.println(this.getClass());
                properties.setProperty("tank" + id + "_y", "" + y);
            } else if (this != null && this.getClass() == Hero.class) {
                properties.setProperty("tankHero" + "_y", "" + y);
            }
            try {
                properties.store(fileWriter, null);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }

    public int getId() {
        return id;
    }

    public void moveDown() {

        if (y < MyPanel.HEIGHT - 60) {
            y += speed;
            if (y > 0) {

                if (this != null && this.getClass() != Hero.class) {
                    properties.setProperty("tank" + id + "_y", "" + y);

                } else if (this != null && this.getClass() == Hero.class) {
                    properties.setProperty("tankHero" + "_y", "" + y);
                }
                try {
                    properties.store(fileWriter, null);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }

    public void moveLeft() {
        if (x > 0) {
            x -= speed;

            if (this != null && this.getClass() != Hero.class) {
                properties.setProperty("tank" + id + "_x", "" + x);

            } else if (this != null && this.getClass() == Hero.class) {
                properties.setProperty("tankHero" + "_x", "" + x);
            }
            try {
                properties.store(fileWriter, null);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    public void moveRight() {

        if (x < MyPanel.HEIGHT - 60) {
            x += speed;
            if (this != null && this.getClass() != Hero.class) {
                properties.setProperty("tank" + id + "_x", "" + x);

            } else if (this != null && ((Hero) this).getClass() == Hero.class) {
                properties.setProperty("tankHero" + "_x", "" + x);
            }

            try {
                properties.store(fileWriter, null);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }


}

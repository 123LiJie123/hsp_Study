package com.hansunping_secondstage.io_;

import org.junit.Test;

import java.io.File;

public class Directory_ {
    public static void main(String[] args) {
        //创建一个目录
    }

    @Test
    public void m1() {
        String filePath = "d:\\file\\news1.txt";
        File file = new File(filePath);

        if (file.exists()) {

            if (file.delete()) {
                //file.delete删除成功 则返回true 如果删除失败 则返回false.
                System.out.println("删除成功");
            } else {
                System.out.println("删除失败");
            }
        } else {
            System.out.println("该文件不存在……");
        }
    }

    //判断 D:\\file01是否存在,存在就删除,否则提示不存在
    @Test
    public void m2() {

        String filePath = "D:\\file\\file01";
        File file = new File(filePath);

        if (file.exists()) {
            if (file.delete()) {
                //file.delete删除成功 则返回true 如果删除失败 则返回false.
                System.out.println("删除成功");
            } else {
                System.out.println("删除失败");
            }
        } else {
            System.out.println("该目录不存在……");
        }
    }

    //  判断 D:\\file\\a\\b\\c目录是否存在,如果存在就提示已经存在,否则就创建
    @Test
    public void m3() {
        String filePath = "D:\\file\\a\\b\\c";
        File file = new File(filePath);

        if (file.exists()) {
            System.out.println("该目录已经存在");
        } else {
            if (file.mkdirs()) {
                System.out.println("该目录创建成功");
            } else {
                System.out.println("该目录创建失败");
            }
        }

    }
}

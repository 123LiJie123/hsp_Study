package com.hansunping_secondstage.io_.outputStream_;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class ObjectOutStream_ {
    /*
    演示ObjectOutPutStream的使用，完成数据的序列化
     */
    int asd = 123;

    public static void main(String[] args) throws Exception {
        //序列化后，保存的文件格式，不是存文本，而是按照他的格式来保存
        String filePath = "D:\\file\\data.dat";

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filePath));

        //序列化数据到 D:\\file\\data.txt
        oos.writeInt(100);   //int
        oos.writeBoolean(true);   //boolean
        oos.writeChar('a');   //char
        oos.writeDouble(9.5);  //double
        oos.writeUTF("aaaaa学习");  //String

        //保存一个Dog对象

        oos.writeUnshared(new Dog(1, '男', "黑色"));

        oos.close();

    }
}



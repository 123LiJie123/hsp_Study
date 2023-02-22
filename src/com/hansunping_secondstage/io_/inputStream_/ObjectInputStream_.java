package com.hansunping_secondstage.io_.inputStream_;


import com.hansunping_secondstage.io_.outputStream_.Dog;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ObjectInputStream_ {
    public static void main(String[] args) throws Exception {
        String strPath = "D:\\file\\data.dat";

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(strPath));

        System.out.println(ois.readInt());
        System.out.println(ois.readBoolean());
        System.out.println(ois.readChar());
        System.out.println(ois.readDouble());

        System.out.println(ois.readUTF());
        Object o = ois.readObject();
        System.out.println(o.getClass());

        //1、如果我们希望调用Dog方法，需要向下转型
        //2、需要我们将Dog类的定义，拷贝到可以引用的位置
        Dog dog = (Dog) o;

        System.out.println(dog.getAnInt());


        ois.close();
    }
}

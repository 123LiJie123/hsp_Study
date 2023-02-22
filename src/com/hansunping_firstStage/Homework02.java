package com.hansunping_firstStage;

public class Homework02 {
    public static void main(String[] args) {
        String str = "123abc";
        A02 a02 = new A02();
      int a =  a02.find(str,'3');
      System.out.println("下标为："+a);

    }
}
class A02{
        /*
        定义方法find，实现查找某字符串数组中的元素查找，并返回索引。
         */
    public int find(String str,char target){
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) ==target&&str.charAt(i)!='\0'){
                return i;
            }
        }
        return -1;
    }
}

package com.hansunping_firstStage;

import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;
import static java.lang.Boolean.TYPE;


public class getUnicde {


    public static void main(String[] args) {
       String s = "你我她";
       System.out.println(s + "--的unicode编码是:"+gbEncoding(s));
    }

    public static String gbEncoding(String gbString){
        char[] utfBytes = gbString.toCharArray();

        String unicodeBytes = "";

        for (int i = 0; i < utfBytes.length; i++) {
            String hexB = Integer.toHexString(utfBytes[i]);
            System.out.println("--------:"+hexB);
            if (hexB.length()<=2){
                hexB = "00"+hexB;
            }
            unicodeBytes = unicodeBytes+"\\u"+hexB;
        }

        return unicodeBytes;
    }


    /*
     * unicode编码转中文
     */
    public static String decodeUnicode(final String dataStr) {
        int start = 0;
        int end = 0;
        final StringBuffer buffer = new StringBuffer();
        while (start > -1) {
            end = dataStr.indexOf("\\u", start + 2);
            String charStr = "";
            if (end == -1) {
                charStr = dataStr.substring(start + 2, dataStr.length());
            } else {
                charStr = dataStr.substring(start + 2, end);
            }
            char letter = (char) Integer.parseInt(charStr, 16); // 16进制parse整形字符串。
            buffer.append(new Character(letter).toString());
            start = end;
        }
        return buffer.toString();
    }
}

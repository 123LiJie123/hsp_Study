package com.hansunping_secondstage.io_.writer_;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriter_ {
    //将“风雨之后，定见彩虹”写入到D:\\file\\note.txt文件中


    public static void main(String[] args) {
        FileWriter fileWriter = null;

        char[] chars = {'1', '2', '3'};


        try {
            fileWriter = new FileWriter("D:\\file\\note.txt");
            fileWriter.write("风雨之后，定见彩虹");


            fileWriter.write(chars);

            fileWriter.write(1);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {

                //FileWriter,一定要关闭流，或者flush才能真正的把数据写入到文件
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

package com.hansunping_thirdstage_.internet_.socket_.tcp_;

import java.io.*;
import java.net.Socket;

public class StreamUtils {
    public static BufferedReader getBufferedReader(Socket socket) {
        BufferedReader bdr = null;
        try {
            InputStream inputStream = socket.getInputStream();
            bdr = new BufferedReader(new InputStreamReader(inputStream));
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (bdr != null) {
            return bdr;
        }
        return null;
    }


    public static BufferedWriter getBufferedWriter(Socket socket) {
        BufferedWriter bdw = null;
        try {
            OutputStream outputStream = socket.getOutputStream();
            bdw = new BufferedWriter(new OutputStreamWriter(outputStream));
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (bdw != null) {
            return bdw;
        }
        return null;
    }


    public static byte[] readByteData(InputStream ism) {
        byte[] buf = new byte[1024];
        int readLen;

        try {
            if ((readLen = ism.read(buf)) != -1) {
                return buf;
            } else {
                return null;
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }


    public static void writeByteData(OutputStream out, byte... bytes) {
        try {

            out.write(bytes);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }


    public static void readCharData(BufferedReader bfr) {
        try {
            String string = bfr.readLine();

            System.out.println(string);


        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    public static void writeCharData(BufferedWriter bfw, String str) {
        try {
            bfw.write(str);
            bfw.newLine();
            bfw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

package ch18.lecture.p2inputStream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class C01InputStream {
    public static void main(String[] args) {
        String fileName = "temp/test3.db";
        try (InputStream is = new FileInputStream(fileName)) {
            int data1 = is.read();// 1 byte 읽기
            int data2 = is.read();// 1 byte 읽기
            int data3 = is.read();// 1 byte 읽기
            int data4 = is.read();// -1 리턴

            System.out.println("data1 = " + data1);
            System.out.println("data2 = " + data2);
            System.out.println("data3 = " + data3);
            System.out.println("data4 = " + data4);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

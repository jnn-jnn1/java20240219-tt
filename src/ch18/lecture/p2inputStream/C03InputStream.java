package ch18.lecture.p2inputStream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class C03InputStream {
    public static void main(String[] args) {
        String fileName = "temp/output9.data"; // 24 bytes
        try (InputStream is = new FileInputStream(fileName)) {
            byte[] datas = new byte[10];

            int len1 = is.read(datas);// 10 bytes 읽음 10 리턴
            int len2 = is.read(datas);// 10 bytes 읽음 10 리턴
            int len3 = is.read(datas);// 4 bytes 읽음 4 리턴
            int len4 = is.read(datas);// 읽은 데이터 없음. -1 리턴

            System.out.println("len1 = " + len1);
            System.out.println("len2 = " + len2);
            System.out.println("len3 = " + len3);
            System.out.println("len4 = " + len4);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

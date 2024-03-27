package ch18.lecture.p1outputStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class C09OutputStream {
    public static void main(String[] args) {
        String fileName = "temp/output9.data";
        try (OutputStream os = new FileOutputStream(fileName)) {
            byte[] data = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110};

            os.write(data);
            os.write(data, 0, 10); // 10 bytes 쓰기
            os.write(data, 5, 3); // 5번 인덱스부터 3번 쓰기
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

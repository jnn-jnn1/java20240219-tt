package ch18.sec02.exam03;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteExample {
    public static void main(String[] args) {
        try (OutputStream os = new FileOutputStream("temp/test3.db")) {
            byte[] array = {10, 20, 30, 40, 50};

            try (os) {
                os.write(array, 1, 3);

                os.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

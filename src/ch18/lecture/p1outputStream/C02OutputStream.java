package ch18.lecture.p1outputStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class C02OutputStream {
    public static void main(String[] args) throws IOException {
        // temp/output2.data로 출력 데이터 내보냄
        OutputStream os = new FileOutputStream("temp/output2.data");

        os.write(29374); // 1 byte 출력
        byte[] array = {10, 20, 30, 40, 50};
        os.write(array); // 배열 array 출력
        os.write(array, 1, 3); // 1번 인덱스부터 3개까지 출력

        os.flush(); // 아직 스트림에 출력되지 않은 데이터들을 강제로 출력
        os.close(); // 꼭 작성해야함
    }
}

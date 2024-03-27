package ch18.lecture.p4reader;

import java.io.*;

public class C05CopyCode {
    public static void main(String[] args) {
        // C05CopyCope.java 파일을
        // temp/C05CopyCode.txt 파일로 복사

        // Reader, Writer 활용

        String src = "src/ch18/lecture/p4reader/C05CopyCode.java";
        String des = "temp/C05CopyCode.txt";

        try {
            Reader reader = new FileReader(src);
            Writer writer = new FileWriter(des);
            try (reader; writer) {
                int len = 0;
                char[] c = new char[1024];
                while ((len = reader.read(c)) != -1) {
                    writer.write(c, 0, len);
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

package ch18.lecture.p3writer;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class C03Writer {
    public static void main(String[] args) {
        String fileName = "temp/output3.txt";
        try {
            Writer writer = new FileWriter(fileName);
            try (writer) {
                writer.write(44145);
                writer.write('가');
                writer.write(new char[]{'손', '흥', '민', '7'});
                writer.write("hello world!");
                writer.write("😂");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}

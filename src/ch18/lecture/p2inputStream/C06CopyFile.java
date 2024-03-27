package ch18.lecture.p2inputStream;

import java.io.*;

public class C06CopyFile {
    public static void main(String[] args) {
        String inputFileName = "temp/dog.png";
        String outputFileName = "temp/dog-copy.png";
        try {
            InputStream is = new FileInputStream(inputFileName);
            OutputStream os = new FileOutputStream(outputFileName);

            try (is; os) {
                int len = 0;
                byte[] data = new byte[10];
                while ((len = is.read(data)) != -1) {
                    os.write(data, 0, len);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

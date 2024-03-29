package ch19.lecture.p1network;

import java.io.*;
import java.net.Socket;

public class C03Computer2 {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("172.30.1.73", 9000);

        try (socket) {
            InputStream is = socket.getInputStream();
            BufferedInputStream bis = new BufferedInputStream(is);

            String fileName = "temp/image.jpg";
            OutputStream os = new FileOutputStream(fileName);
            BufferedOutputStream bos = new BufferedOutputStream(os);

            try (is; bis; os; bos) {
                byte[] bytes = new byte[100];
                int len = 0;
                while ((len = bis.read(bytes)) != -1) {
                    bos.write(bytes, 0, len);
                }

                bos.flush();
                System.out.println("실행 완료");
            }
        }
    }
}

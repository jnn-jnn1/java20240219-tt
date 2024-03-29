package ch19.lecture.p1network;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class C03Computer1 {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(9000);
        Socket socket = serverSocket.accept();

        try (socket) {
            OutputStream os = socket.getOutputStream();
            BufferedOutputStream bos = new BufferedOutputStream(os);

            String fileName = "temp/cat.jpg";
            InputStream is = new FileInputStream(fileName);
            BufferedInputStream bis = new BufferedInputStream(is);

            try (os; bos; is; bis) {
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

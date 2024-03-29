package ch19.lecture.p1network;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Computer2 {
    public static void main(String[] args) throws IOException {
        System.out.println("실행");
        ServerSocket serverSocket = new ServerSocket(9000);
        Socket socket = serverSocket.accept();

        try (socket) {
            InputStream is1 = socket.getInputStream();
            InputStreamReader isr1 = new InputStreamReader(is1);
            BufferedReader br1 = new BufferedReader(isr1);

            OutputStream os1 = socket.getOutputStream();
            OutputStreamWriter osw1 = new OutputStreamWriter(os1);
            BufferedWriter bw1 = new BufferedWriter(osw1);
            PrintWriter pw1 = new PrintWriter(bw1);

            Scanner scanner = new Scanner(System.in);

            try (os1; osw1; bw1; pw1; scanner; is1; isr1; br1) {
                while (true) {
                    System.out.print("입력>");
                    String sendMessage = scanner.nextLine();
                    pw1.println(sendMessage);
                    if (sendMessage.equals("bye")) {
                        break;
                    }
                    pw1.flush();
                    String receiveMessage = br1.readLine();
                    System.out.println("받은 메세지 : " + receiveMessage);
                }
                System.out.println("종료");
            }
        }
    }
}

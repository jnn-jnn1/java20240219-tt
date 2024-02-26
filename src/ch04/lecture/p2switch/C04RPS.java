package ch04.lecture.p2switch;

import java.util.Random;
import java.util.Scanner;

public class C04RPS {
    public static void main(String[] args) {
        // 가위바위보 게임 만들기

        // 1, 2, 3


        String[] arr = {"당신이 이겼습니다", "컴퓨터가 이겼습니다", "비겼습니다"};
        String user_print = "";
        String pc_print = "";
        String result = "";


        while (true) {
            Scanner scanner = new Scanner(System.in);
            Random random = new Random();
            System.out.println("가위(1), 바위(2), 보(3), 끝내기(4)를 선택하세요");

            int user = Integer.parseInt(scanner.nextLine());
            int computer = random.nextInt(1, 4);

            if (user < 1 || user > 4) {
                System.out.println("잘못 입력했습니다");
                continue;
            }
            if (user == 4) {
                System.out.println("가위바위보를 종료합니다.");
                break;
            }

            String userchat = user == 1 ? "가위" : user == 2 ? "바위" : user == 3 ? "보" : "잘못 입력했습니다";
            String comchat = computer == 1 ? "가위" : computer == 2 ? "바위" : "보";

            System.out.println("유저의 결과 = " + userchat);
            System.out.println("컴퓨터의 결과 = " + comchat);

            switch (user) {
                case 1 -> user_print = "가위";
                case 2 -> user_print = "바위";
                case 3 -> user_print = "보";
                default -> user_print = "잘못 입력했습니다";
            }

            switch (computer) {
                case 1 -> comchat = "가위";
                case 2 -> comchat = "바위";
                case 3 -> comchat = "보";
            }


            //     1: 가위 2; 바위 3: 보
            if (user == 1) {
                if (computer == 1) {
                    result = "비겼습니다";
                } else if (computer == 2) {
                    result = "컴퓨터가 이겼습니다";
                } else {
                    result = "유저가 이겼습니다";
                }
            }

            if (user == 2) {
                if (computer == 1) {
                    result = "유저가 이겼습니다";
                } else if (computer == 2) {
                    result = "비겼습니다";
                } else {
                    result = "컴퓨터가 이겼습니다";
                }
            }

            if (user == 3) {
                if (computer == 1) {
                    result = "컴퓨터가 이겼습니다";
                } else if (computer == 2) {
                    result = "유저가 이겼습니다";
                } else {
                    result = "비겼습니다";
                }
            }

            System.out.println(result);

        }


    }
}

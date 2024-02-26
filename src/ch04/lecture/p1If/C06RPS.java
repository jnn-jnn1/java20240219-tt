package ch04.lecture.p1If;

import java.util.Scanner;
import java.util.Random;

public class C06RPS {
    public static void main(String[] args) {
        // 가위바위보 게임 만들기

        // 1, 2, 3


        String[] arr = {"당신이 이겼습니다", "컴퓨터가 이겼습니다", "비겼습니다"}; // 가위바위보 결과 배열
        String user_print = ""; // 가위,바위,보 중 유저가 낸 것
        String pc_print = ""; // 가위,바위,보 중 컴퓨터가 낸 것
        String result = ""; // 가위바위보 결과


        while (true) {
            Scanner scanner = new Scanner(System.in);
            Random random = new Random();
            System.out.println("가위(1), 바위(2), 보(3), 끝내기(4)를 선택하세요");

            int user = Integer.parseInt(scanner.nextLine());
            int computer = random.nextInt(1, 4);

            // 선택지에 없는 숫자 입력
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

            // 가위바위보 조건문
            if (user + 1 == computer) {
                result = arr[1];
            } else if (user + 2 == computer) {
                result = arr[0];
            } else if (user - 1 == computer) {
                result = arr[0];
            } else if (user - 2 == computer) {
                result = arr[1];
            } else if (user == computer) {
                result = arr[2];
            } else {
                result = "입력이 잘못되었습니다";
            }

            System.out.println(result);

        }


//        if (user == 1) {
//            user_print = "가위";
//        } else if (user == 2) {
//            user_print = "바위";
//        } else if (user == 3) {
//            user_print = "보";
//        } else
//            user_print = "잘못 입력했습니다";
//
//        if (computer == 1) {
//            pc_print = "가위";
//        } else if (computer == 2) {
//            pc_print = "바위";
//        } else if (computer == 3) {
//            pc_print = "보";
//        }

        // 1: 가위 2; 바위 3: 보
//        if (user == 1) {
//            if (computer == 1) {
//                result = "비겼습니다";
//            } else if (computer == 2) {
//                result = "컴퓨터가 이겼습니다";
//            } else {
//                result = "유저가 이겼습니다";
//            }
//        }
//
//        if (user == 2) {
//            if (computer == 1) {
//                result = "유저가 이겼습니다";
//            } else if (computer == 2) {
//                result = "비겼습니다";
//            } else {
//                result = "컴퓨터가 이겼습니다";
//            }
//        }
//
//        if (user == 3) {
//            if (computer == 1) {
//                result = "컴퓨터가 이겼습니다";
//            } else if (computer == 2) {
//                result = "유저가 이겼습니다";
//            } else {
//                result = "비겼습니다";
//            }
//        }


    }
}

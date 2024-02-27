package ch04.lecture.p3while;

import java.util.Scanner;

public class FinalExample {
    public static void main(String[] args) {
        String grade = "B";

        int score1 = 0;
        score1 = switch (grade) {
            case "A" -> {
                yield 100;
            }
            case "B" -> {
                yield 100 - 20;
            }
            default -> 60;
        };
        System.out.println(score1);

        for (int i = 0; i <= 100; i++) {
            if (i % 3 != 0)
                continue;
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                if (4 * i + 5 * j == 60)
                    System.out.println("(" + i + "," + j + ")");
            }
        }

        Scanner scanner = new Scanner(System.in);
        int save = 0;

        while (true) {
            System.out.println("-------------");
            System.out.println("1.예금 | 2.출금 | 3.잔고 | 4. 종료");
            System.out.println("-------------");
            System.out.print("선택>");
            String check = scanner.nextLine();
            if (check.equals("1")) {
                System.out.print("예금액>");
                String money = scanner.nextLine();
                save += Integer.parseInt(money);
                System.out.println(save + "원");
            } else if (check.equals("2")) {
                System.out.print("출금액>");
                String money = scanner.nextLine();
                save -= Integer.parseInt(money);
                System.out.println(save + "원");
            } else if (check.equals("3")) {
                System.out.print("잔고>");
                System.out.println(save + "원");
            } else if (check.equals("4")) {
                break;
            }
        }

    }


}

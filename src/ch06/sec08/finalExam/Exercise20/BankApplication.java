package ch06.sec08.finalExam.Exercise20;

import java.util.Scanner;

public class BankApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Account[] accounts = new Account[100];
        boolean run = true;
        while (run) {
            System.out.println(
                    """
                            ---------------------------------------------
                            1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료
                            _____________________________________________
                                    """
            );
            System.out.print("선택>");
            String menu = scanner.nextLine();

            switch (menu) {
                case "1" -> {
                    System.out.println("""
                            --------------
                            계좌생성
                            --------------
                            """);
                    System.out.print("계좌번호: ");
                    String accountNumber = scanner.nextLine();
                    System.out.print("계좌주: ");
                    String accountName = scanner.nextLine();
                    System.out.print("초기입금액: ");
                    int balance = Integer.parseInt(scanner.nextLine());

                    Account account = new Account();
                    account.setNumber(accountNumber);
                    account.setName(accountName);
                    account.setBalance(balance);


                    System.out.println("결과: 계좌가 생성되었습니다");
                }
                case "2" -> {
                }
                case "3" -> {
                }
                case "4" -> {
                }
                case "5" -> run = false;
            }
        }

    }
}

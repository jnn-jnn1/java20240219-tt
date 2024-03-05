package ch06.sec08.finalExam;

import java.util.Scanner;

public class Exam20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Account[] accounts = new Account[100];
        BankApplication b1 = new BankApplication();
        boolean run = true;
        int count = 0;
        String number = "";
        String name = "";
        int money = 0;
        String getNumber = "";
        int getMoney = 0;

        while (run) {
            System.out.println("---------------------------------------------------");
            System.out.println("1. 계좌생성 | 2. 계좌목록 | 3. 예금 | 4. 출금 | 5. 종료");
            System.out.println("---------------------------------------------------");
            System.out.print("선택>");
            String menu = scanner.nextLine();
            switch (menu) {
                case "1" -> {
                    System.out.print("계좌번호: ");
                    number = scanner.nextLine();
                    System.out.print("계좌주: ");
                    name = scanner.nextLine();
                    System.out.print("초기입금액: ");
                    money = scanner.nextInt();
                    System.out.println("결과: 계좌가 생성되었습니다");

                    accounts[count] = new Account(number, name, money);

                    count++;
                }
                case "2" -> {
                    b1.menu2(accounts, count);
                }
                case "3" -> {
                    System.out.print("계좌번호 : ");
                    getNumber = scanner.nextLine();
                    System.out.print("예금액 : ");
                    getMoney = scanner.nextInt();

                    b1.menu3(accounts, getNumber, getMoney, count);
                }
                case "4" -> {
                    System.out.print("계좌번호 : ");
                    getNumber = scanner.nextLine();
                    System.out.print("출금액 : ");
                    getMoney = scanner.nextInt();
                    System.out.println("결과 : 출금이 성공되었습니다");

                    b1.menu4(accounts, getNumber, getMoney, count);
                }
                case "5" -> {
                    run = false;
                    System.out.println("프로그램 종료");
                }
            }

        }
    }
}

class Account {
    String number;
    String name;
    int money;

    Account(String number, String name, int money) {
        this.number = number;
        this.name = name;
        this.money = money;
    }
}

class BankApplication {
    void menu2(Account[] accounts, int count) {
        System.out.println("---------");
        System.out.println("계좌목록");
        System.out.println("---------");
        for (int i = 0; i < count; i++) {
            System.out.println(accounts[i].number + "    " + accounts[i].name + "   " + accounts[i].money);
        }
    }

    void menu3(Account[] accounts, String number, int money, int count) {
        for (int i = 0; i < count; i++) {
            if (accounts[i].number.equals(number))
                accounts[i].money += money;
        }
    }

    void menu4(Account[] accounts, String number, int money, int count) {
        for (int i = 0; i < count; i++) {
            if (accounts[i].number.equals(number))
                accounts[i].money -= money;
        }
    }
}

package ch02.lecture.p02type;

import java.util.Scanner;

public class C15Scanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String Line = scanner.nextLine(); //키보드 입력 받음

        System.out.println("line = " + Line);

        scanner.close();
    }
}

package ch06.sec08.finalExam;

import java.util.Scanner;

public class Exam09 {
    public static void main(String[] args) {
        MemberService memberService = new MemberService();
        Scanner scanner = new Scanner(System.in);

        System.out.print("아이디를 입력하세요 : ");
        memberService.id = scanner.nextLine();
        System.out.print("비밀번호를 입력하세요 : ");
        memberService.password = scanner.nextLine();

        memberService.printlogin();
    }
}

class MemberService {
    String id;
    String password;

    boolean login() {
        if (id.equals("hong") && password.equals("12345")) {
            return true;
        }
        return false;
    }

    void logout() {
        System.out.println(id + "님이 로그아웃 되었습니다");
    }

    void printlogin() {
        if (login()) {
            System.out.println("로그인되었습니다");
            logout();
        } else {
            System.out.println("id 혹은 password가 올바르지 않습니다");
        }
    }
}


package ch06.sec08.finalExam;

public class Exam13 {
}

class Member {
    String name;
    String id;
    String password;
    int age;

    Member(String name, String id) {
        this.name = name;
        this.id = id;
    }

    class MemberService {
        boolean login() {
            if (id.equals("hong") && password.equals("12345")) {
                return true;
            }
            return false;
        }

        void logout() {
            System.out.println("id 또는 paswword가 올바르지 않습니다");
        }
    }
}

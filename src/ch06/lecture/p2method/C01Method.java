package ch06.lecture.p2method;

public class C01Method {
    public static void main(String[] args) {
        C01Person person1 = new C01Person();
        C01Person person2 = new C01Person();

        person1.name = "son";
        person2.name = "lee";

        person1.walk(); // 기능(메소드) 실행
        person2.walk();
    }
}

class C01Person {
    String name;

    void walk() {
        System.out.println(name + "이 걷습니다");
    }
}
package ch06.lecture.p2method;

public class C03Method {
    public static void main(String[] args) {
        C04Person john = new C04Person();
        C04Person jane = new C04Person();
        john.name = "john";
        jane.name = "jane";
        int speed = 50;
        jane.maxspeed(10, 20);

        john.run();
        jane.walk(speed);
    }
}

class C04Person {
    String name;

    // 파라미터 X
    void run() {
        System.out.println(name + "이 달립니다");
    }

    // 파라미터 o
    void walk(int speed) {
        System.out.println(name + "이" + speed + "의 속도로 걷습니다");
    }

    int maxspeed(int a, int b) {
        return a + b;
    }
}


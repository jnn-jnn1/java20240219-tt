package ch08.lecture.p1interface;

public class C05DefaultMethod {
    public static void main(String[] args) {
        C05MyInterface a = new C05Myclass1();
        C05MyInterface b = new C05Myclass2();

        a.method100();
        b.method100();
    }
}

interface C05MyInterface {
    // 몸통(body)가 있는 public 인스턴스 클래스
    default void method100() {
        System.out.println("C05MyInterface.method100");
    }

    ;
}

class C05Myclass1 implements C05MyInterface {

}

class C05Myclass2 implements C05MyInterface {

}
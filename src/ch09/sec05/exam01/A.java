package ch09.sec05.exam01;

public class A {
    int field1;

    void method1() {
    }

    static int field2;

    static void method2() {
    }

    // 인스턴스 멤버 클래스
    class B {
        void method() {
            // 인스턴스 필드와 메소드 사용 가능
            field1 = 10;
            method1();
            // 정적 필드와 메소드 사용 가능
            field2 = 10;
            method2();
        }
    }

    // 정적 멤버 클래스
    static class C {
        void method() {
            // 인스턴스 필드와 메소드 사용 불가능
            // field1 = 10;
            // method1();
            // 정적 필드와 메소드 사용 가능
            field2 = 10;
            method2();
        }
    }
}

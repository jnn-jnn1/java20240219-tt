package ch09.lecture.p2anonymous;

public class C06AnonymousClass {
    public static void main(String[] args) {
        C06MyInterface obj = new C06MyInterface() {
            @Override
            public void method1() {
                System.out.println("C06AnonymousClass.method1");
            }

            @Override
            public void method2() {
                System.out.println("C06AnonymousClass.method2");
            }
        };
    }
}

// @formatter:off
interface C06MyInterface{
    void method1();
    void method2();
}

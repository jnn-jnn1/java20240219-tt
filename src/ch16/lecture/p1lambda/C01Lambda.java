package ch16.lecture.p1lambda;

public class C01Lambda {
    public static void main(String[] args) {

        // 인터페이스의 익명 구현 객체
        C01MyInterface obj1 = new C01MyInterface() {
            @Override
            public void method() {
                System.out.println("C01Lambda.method");
            }
        };

        // 람다식으로 변환
        C01MyInterface obj2 = () -> System.out.println("C01Lambda.main");
    }
}

interface C01MyInterface {
    void method();
}
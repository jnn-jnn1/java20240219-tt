package ch16.lecture.p1lambda;

public class C06Lambda {
    public static void main(String[] args) {
        C06MyInterface obj = a -> System.out.println("C06Lambda.");
    }
}

// 2. 매개변수가 1개 있고 리턴이 없는 추상 메소드
@FunctionalInterface
interface C06MyInterface {
    void method(int a);
}
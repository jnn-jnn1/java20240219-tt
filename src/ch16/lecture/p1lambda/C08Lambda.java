package ch16.lecture.p1lambda;

import org.w3c.dom.ls.LSOutput;

public class C08Lambda {
    public static void main(String[] args) {
        C08MyInterface obj = () -> {
            System.out.println("C08Lambda.main");
        };
    }
}

// 3. 매개변수가 없고 리턴이 없는 추상 메소드
@FunctionalInterface
interface C08MyInterface {
    void method();
}

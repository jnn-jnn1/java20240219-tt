package ch06.lecture.p2method;

public class C10Return {
    public static void main(String[] args) {
        C10MyClass o = new C10MyClass();
        int a = o.method1();

        double b = o.method2();

    }
}

class C10MyClass {
    // return :
    // 호출된 곳으로 값을 반환함
    // 반환되는 값의 타입이 메소드의 타입과 일치해야 함

    int method1() {
        // 1. 메소드 종료, 2. 값 반환
        return 5;
    }

    double method2() {
        return 3.14;
    }

    String method3() {
        return "hello";
    }

    long method4() {
        return 5;
    }

    double method5() {
        return 10;
    }

    // void : 반환하는 값이 없음

    void method6() {
        return; // return을 메소드 종료 기능으로만 사용 가능
    }
}

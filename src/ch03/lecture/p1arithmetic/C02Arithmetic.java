package ch03.lecture.p1arithmetic;

public class C02Arithmetic {
    public static void main(String[] args) {
        // 증감연산자
        // ++, --
        // 피연산자 갯수 : 1개
        // 연산의 결과 : 피연산자의 타입
        // 연산의 결과값
        // 1. 피연산자의 값
        // 2. (피연산자의 값 + 1) 또는 (피연산자의 값 - 1)
        int a = 10;
        int a1 = a++;
        System.out.println("a1 = " + a1);
        System.out.println("a = " + a);

        int b = 10;
        int b1 = ++b;
        System.out.println("b = " + b);
        System.out.println("b1 = " + b1);

    }
}

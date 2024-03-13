package ch16.lecture.p1lambda;

public class C05Sample {
    public static void main(String[] args) {
        C05MyInterface obj1 = (x, y) -> System.out.println(x / y);
        C05MyInterface obj2 = (num1, num2) -> System.out.println(num1 % num2);
        obj1.method(5, 3);
        obj2.method(5, 3);
    }
}

@FunctionalInterface
interface C05MyInterface {
    void method(int a, int b);
}

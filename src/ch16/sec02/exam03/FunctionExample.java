package ch16.sec02.exam03;

public class FunctionExample {
    public static void main(String[] args) {
        // 람다식을 매개변수로 제공
        action((x, y) -> x + y);
        action((x, y) -> x / y);
    }

    static void action(Function function) {
        double result = function.func(10, 4);
        System.out.println(result);
    }
}

package ch16.lecture.p1lambda;

public class C18MethodReference {
    public static void main(String[] args) {
        Computer com = new Computer();
        com.action(Lambda::staticMethod); // 14

        Lambda lam = new Lambda();
        com.action(lam::instanceMethod); // 6
    }
}

class Computer {
    public void action(Function function) {
        int result = function.method(10, 4);
        System.out.println(result);
    }
}

class Lambda {
    public static int staticMethod(int a, int b) {
        return a + b;
    }

    public int instanceMethod(int a, int b) {
        return a - b;
    }
}

@FunctionalInterface
interface Function {
    public int method(int a, int b);
}

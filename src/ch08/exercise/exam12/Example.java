package ch08.exercise.exam12;

public class Example {
    public static void main(String[] args) {
        A a = new C();

        if (a instanceof C c) {
            c.method2();
        }
    }
}

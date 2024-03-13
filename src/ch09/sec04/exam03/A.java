package ch09.sec04.exam03;

public class A {
    public void method1(int arg) {
        int var = 1;

        class B {
            void method2() {
                System.out.println("arg = " + arg);
                System.out.println("var = " + var);

                // arg= 2; X
                // var = 2; X
            }
        }

        B b = new B();
        b.method2();

        // arg = 3; X
        // var = 3; X
    }
}

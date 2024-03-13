package ch07.p2polymorphism;

public class C05Polymorphism {
    A a;

    C05Polymorphism() {
        a = new A();
        a = new B();
        a = new C();
    }

    public static void main(A a) {
        // 지역변수
        a = new A();
        a = new B();
        a = new C();


    }
}

class A {
    public void method1() {
        System.out.println("A.method1");
    }
}

class B extends A {
    public void method2() {
        System.out.println("B.method2");
    }
}

class C extends A {
    public void method3() {
        System.out.println("C.method3");
    }
}


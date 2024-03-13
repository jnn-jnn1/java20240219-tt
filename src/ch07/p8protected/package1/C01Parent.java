package ch07.p8protected.package1;

public class C01Parent {

    // package private
    void method1() {
        System.out.println("C01Parent.method1");
    }

    // protected
    protected void method2() {
        System.out.println("C01Parent.method2");
    }
}

package ch07.p8protected.package2;

import ch07.p8protected.package1.C01Parent;

public class C01Other2 {
    private void method1() {
        C01Parent o1 = new C01Parent();

        // package private
//        o1.method1(); 실행 안됨

        // protected
//        o1.method2(); 실행 안됨
    }
}

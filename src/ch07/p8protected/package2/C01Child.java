package ch07.p8protected.package2;

import ch07.p8protected.package1.C01Parent;

public class C01Child extends C01Parent {
    private void method9() {
        // package private
//        super.method1(); 접근 불가

        // protected 접근 가능
        super.method2();
    }
}

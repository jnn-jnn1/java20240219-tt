package ch06.lecture.p7access.package1;

import ch06.lecture.p7access.C01MyClass;

public class C03AccessModifier {
    public static void main(String[] args) {
        C01MyClass o1 = new C01MyClass();
        o1.age = 50;
        // 안됨 o1.address = 30;
        // 안됨 o1.name = "son";
    }
}

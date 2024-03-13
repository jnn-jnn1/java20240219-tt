package ch09.lecture.p1nested;

public class C02InstanceNestedClass {
    //    C02MyClass.C02NestedClass obj1 = new C02MyClass.C02NestedClass();
    C02MyClass obj1 = new C02MyClass();
    C02MyClass.C02NestedClass obj2 = obj1.new C02NestedClass();
}

class C02MyClass {
    // 중첩 클래스 (nested class)
    class C02NestedClass {

    }
}

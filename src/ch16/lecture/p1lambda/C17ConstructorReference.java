package ch16.lecture.p1lambda;

public class C17ConstructorReference {
    public static void main(String[] args) {
        C17MyInterface1 obj1 = C17MyClass::new;
        C17MyInterface1 obj2 = () -> new C17MyClass();
        C17MyInterface2 obj3 = C17MyClass::new;
        C17MyInterface2 obj4 = (s, i) -> new C17MyClass(s, i);
    }
}

class C17MyClass {
    C17MyClass() {
    }

    C17MyClass(String s, int i) {
    }
}

@FunctionalInterface
interface C17MyInterface1 {
    C17MyClass Method();
}

@FunctionalInterface
interface C17MyInterface2 {
    C17MyClass method(String s, int i);
}
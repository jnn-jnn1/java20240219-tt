package ch06.lecture.p3constructor;

public class C03Constructor {
    public static void main(String[] args) {
        C03MyClass obj = new C03MyClass(44);

    }
}

class C03MyClass {
    int age;

    C03MyClass(int initalage) {
        age = initalage;
    }
}

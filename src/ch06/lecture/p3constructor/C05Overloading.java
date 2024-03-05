package ch06.lecture.p3constructor;

public class C05Overloading {
    public static void main(String[] args) {
        C05MyClass c1 = new C05MyClass(22);
        System.out.println(c1.name);
        System.out.println(c1.age);

        C05MyClass c2 = new C05MyClass("lee");
        System.out.println(c1.name);
        System.out.println(c1.age);

    }

}

class C05MyClass {
    String name;
    int age;

    C05MyClass(int initialAge) {
        name = "홍길동";
        age = initialAge;
    }

    C05MyClass(String initialName) {
        name = initialName;
        age = 44;
    }
}

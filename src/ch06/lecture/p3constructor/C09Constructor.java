package ch06.lecture.p3constructor;

public class C09Constructor {
    C09MyClass1 obj1 = new C09MyClass1(33);
    C09MyClass2 obj2 = new C09MyClass2();
    C09MyClass3 obj3 = new C09MyClass3();
    C09MyClass4 obj4 = new C09MyClass4(33);
}

class C09MyClass1 {
    int age;

    public C09MyClass1(int age) {
        this.age = age;
    }
}

class C09MyClass2 {
    public C09MyClass2() {
    }
}

class C09MyClass3 {
    // no-agrs constructor (default constructor)
    // 생성자를 작성하지 않으면
    // 파라미터 없는 생성자 자동 추가
    // 단, 생성자를 작성하면 추가되지 않음
}

class C09MyClass4 {
    int age;

    public C09MyClass4(int age) {
        this.age = age;
    }
}
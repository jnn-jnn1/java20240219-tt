package ch06.lecture.p3constructor;

public class C08This {
    public static void main(String[] args) {
        C08MyClass o1 = new C08MyClass();
    }
}


class C08MyClass {
    String name;
    int age;
    String address;

    public C08MyClass(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public C08MyClass(String name) {
        this.name = name;
    }

    //    public C08MyClass() {
////        this.name = "없음";
////        this.age = 1;
////        this.address = "없음";
//        this("홍길동",1,"없음");
//    }
    public C08MyClass() {
//        this.name = "홍길동";
//        this.age = 1;
//        this.address = "있음";
        this("홍길동", 1, "없음");
    }
}
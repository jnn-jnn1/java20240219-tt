package ch06.lecture.p7access;

public class C06ReadOnly {
    public static void main(String[] args) {
        C06MyClass obj1 = new C06MyClass("son", 33);
        System.out.println("obj1.getName() = " + obj1.getName());
        System.out.println("obj1.getName() = " + obj1.GetAge());

        C06MyClass2 obj2 = new C06MyClass2("lee", 44);
        System.out.println("obj2.name() = " + obj2.name());
        System.out.println("obj2.age() = " + obj2.age());
    }

}
// record : 14버전 이후

record C06MyClass2(
        String name,
        int age
) {
}

class C06MyClass {
    private String name;
    private int Age;

    public C06MyClass(String name, int getAge) {
        this.name = name;
        this.Age = getAge;
    }

    public String getName() {
        return name;
    }

    public int GetAge() {
        return Age;
    }
}

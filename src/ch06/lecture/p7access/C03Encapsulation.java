package ch06.lecture.p7access;

public class C03Encapsulation {
    public static void main(String[] args) {
        C03MyClass obj1 = new C03MyClass();
        System.out.println(obj1.getName());
        System.out.println(obj1.getAge());
    }

}

class C03MyClass {
    private String name;
    private int age;

    // getter
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // setter
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
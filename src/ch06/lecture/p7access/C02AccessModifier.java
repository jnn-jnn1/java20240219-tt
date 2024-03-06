package ch06.lecture.p7access;

public class C02AccessModifier {
    public static void main(String[] args) {
        C01MyClass o1 = new C01MyClass();
        o1.age = 50;
        // 안됨 o1.address = 30;
        o1.name = "son";
    }
}

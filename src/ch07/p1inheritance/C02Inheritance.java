package ch07.p1inheritance;

public class C02Inheritance {
    public static void main(String[] args) {
        C02Child child1 = new C02Child();
        child1.method1();
        child1.method2();
    }
}

// 부모클래스, 상위클래스, 슈퍼클래스
class C02Parent {
    public void method1() {

    }
}

// 자식클래스, 하위클래스, 서브클래스
class C02Child extends C02Parent {
    // 메소드 추가 가능
    public void method2() {

    }
}

// 여러 클래스가 상속 받을 수 있음
class C02Child2 extends C02Parent {

}

package ch07.p4abstract;

import ch07.sec10.exam02.Dog;

public class C02Abstract {
    public static void main(String[] args) {
        C02Animal animal = new C02Fish();
        animal.breathe();
    }
}

abstract class C02Animal {
    // abstract method : 몸통(body) 없는 메소드
    // 하위 클래스가 꼭 재정의 해야 함
    // 추상메소드가 있다면 클래스는 꼭 추상 클래스
    abstract public void breathe();
}

// 구현 클래스 (concrete class)
class C02Fish extends C02Animal {
    @Override
    public void breathe() {
        System.out.println("아가미 호흡");
    }
}

class C02Cat extends C02Animal {
    @Override
    public void breathe() {
        System.out.println("폐 호흡");
    }
}

// 자식클래스가 추상 메소드를 재정의하지 않으면
// 자식클래스도 추상 클래스가 됨
abstract class C02Bird extends C02Animal {

}

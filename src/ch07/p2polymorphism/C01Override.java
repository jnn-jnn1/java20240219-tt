package ch07.p2polymorphism;

public class C01Override {
    public static void main(String[] args) {
        C01Animal animal = new C01Animal();
        animal.breathe(); // 호흡합니다
        C01GoldFish goldFish = new C01GoldFish();
        C01Cat cat = new C01Cat();
        goldFish.breathe(); // 아가미로 호흡합니다
        cat.breathe(); // 폐로 호흡합니다
    }
}

class C01Animal {
    public void breathe() {
        System.out.println("호흡합니다");
    }


}

class C01GoldFish extends C01Animal {
    // method override : 상위 타입의 메소드를 재정의
    public void breathe() {
        System.out.println("아가미로 호흡합니다");
    }

}

class C01Cat extends C01Animal {
    public void breathe() {
        System.out.println("폐로 호흡합니다");
    }

}

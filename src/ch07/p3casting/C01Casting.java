package ch07.p3casting;

public class C01Casting {
    public static void main(String[] args) {
        C01Animal animal1 = new C01Tiger();
        animal1.breathe();
        // animal.roar(); 불간ㅇ
        C01Tiger tiger = (C01Tiger) animal1;
        tiger.roar();

        C01Animal animal2 = new C01Cat();
        C01Cat cat = (C01Cat) animal2;
        cat.meow();
        System.out.println(System.identityHashCode(animal1)); // 495053715
        System.out.println(System.identityHashCode(tiger)); // 495053715

        System.out.println(System.identityHashCode(animal2)); // 1922154895
        System.out.println(System.identityHashCode(cat)); // 1922154895
    }
}

class C01Animal {
    public void breathe() {
        System.out.println("호흡합니다");
    }
}

class C01Tiger extends C01Animal {
    public void roar() {
        System.out.println("어흥");
    }
}

class C01Cat extends C01Animal {
    public void meow() {
        System.out.println("야옹");
    }
}

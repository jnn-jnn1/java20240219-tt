package ch07.p4abstract;

public class C01Abstract {
    public static void main(String[] args) {
        // 추상 클래스로 인스턴스 생성 불가
        // C01Animal animal = new C01Animal();

    }
}

// @formotter:0ff
// 추상 클래스 (abstract class)
abstract class C01Animal {
}

class C01Tiger extends C01Animal {
}

class C01Cat extends C01Animal {
}

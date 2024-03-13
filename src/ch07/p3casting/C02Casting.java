package ch07.p3casting;

public class C02Casting {
    public static void main(String[] args) {
        C02Animal animal1 = new C02Tiger();
        C02Tiger tiger1 = (C02Tiger) animal1;
        // C02Cat cat = (C02Cat) animal1;
        // 컴파일 오류(compile error(exception)) 아님
        // 실행 오류(runtime exception)
    }
}

class C02Animal {

}

class C02Tiger extends C02Animal {

}

class C02Cat extends C02Animal {

}


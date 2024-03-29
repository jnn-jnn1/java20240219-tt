package ch07.p5super;

public class C01Super {
    public static void main(String[] args) {
        C01Child child = new C01Child();
        child.method1();
    }
}

class C01Parent {
    public int filed;

    public void method1() {
        System.out.println(filed);
        System.out.println("부모클래스의 메소드 코드 실행");
    }
}

class C01Child extends C01Parent {
    public void method1() {
        super.method1(); // super : 상위 타입의 멤버(필드, 메소드)를 접근하기 위한 키워드
        super.filed = 5;
        System.out.println(super.filed);
        System.out.println("자식클래스의 메소드 코드 실행");
    }
}

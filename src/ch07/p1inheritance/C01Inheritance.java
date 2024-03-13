package ch07.p1inheritance;

public class C01Inheritance {
    public static void main(String[] args) {
        C01Child child = new C01Child();
        child.name = "홍길동";
        System.out.println("child.name = " + child.name); // 홍길동
        child.method1();
    }
}

class C01Parent {
    public String name;

    public void method1() {
        System.out.println("C01Parent.method1");
    }
}

// extends : 부모의 멤버를 이 클래스에 상속함
class C01Child extends C01Parent {

}
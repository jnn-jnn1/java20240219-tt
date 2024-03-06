package ch06.lecture.p6final;

public class C03Final {
    public static void main(String[] args) {
        C03MyClass o = new C03MyClass();

        System.out.println(o.j); // 10
        // o.j = 20; 불가능
    }
}

class C03MyClass {
    int i;
    // final 인스턴스 필드
    final int j = 10;
    final int k;

    C03MyClass() {
        k = 200;
    }
}

package ch12.lecture.p1object;

public class C01ToString {
    public static void main(String[] args) {
        C01MyClass ob1 = new C01MyClass();
        C01MyClass2 ob2 = new C01MyClass2();
        Object o1 = ob1;
        Object o2 = ob2;
        Object o3 = new C01MyClass();
        Object o4 = new C01MyClass2();
        String s1 = ob1.toString();
        ob2.toString();
        o3.toString();
        o4.toString();
    }
}

class C01MyClass extends Object {
    @Override
    public String toString() {
        return "My Class1의 객체다";
    }
}

// extends Object
class C01MyClass2 {
    @Override
    public String toString() {
        return "마이 클래스2의 객체다";
    }
}

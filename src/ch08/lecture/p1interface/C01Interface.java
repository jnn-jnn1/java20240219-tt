package ch08.lecture.p1interface;

public class C01Interface {
    public static void main(String[] args) {
        C01ConcretClass o1 = new C01ConcretClass();
        C01MyInterface o2 = o1;
    }
}

interface C01MyInterface {

}

class C01ConcretClass implements C01MyInterface {

}

package ch07.p1inheritance;

public class C03Polymorphism {
    public static void main(String[] args) {
        C03Child child1 = new C03Child();
        C03Parent parent = child1;

        C03Parent child2 = new C03Child();

        C03Child2 child02 = new C03Child2();

    }
}

class C03Parent {

}

class C03Child extends C03Parent {

}

class C03Child2 extends C03Parent {

}

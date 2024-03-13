package ch07.sec02.exam02;

import ch08.exercise.exam08.C;

public class ChildExample {
    public static void main(String[] args) {
        Child child = new Child();

        Parent parent = child;
        System.out.println(System.identityHashCode(child));
        System.out.println(System.identityHashCode(parent));
        
        parent.method1();
        parent.method2();
//        parent.method3(); 호출 불가능
    }
}

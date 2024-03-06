package ch06.lecture.p5static;

public class C05Static {

}

class C05MyClass {

    static double area;

    static {
        System.out.println();
        System.out.println();
        System.out.println();
        area = Math.PI * 10 * 10;
    }
}

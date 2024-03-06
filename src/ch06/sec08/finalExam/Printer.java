package ch06.sec08.finalExam;

public class Printer {
    int age;
    boolean is;
    double speed;
    String name;

    static void println(int age) {
        Printer p1 = new Printer();
        p1.age = age;
    }

    static void println(boolean is) {
        Printer p1 = new Printer();
        p1.is = is;
    }

    static void println(double speed) {
        Printer p1 = new Printer();
        p1.speed = speed;
    }

    static void println(String name) {
        Printer p1 = new Printer();
        p1.name = name;
    }
}

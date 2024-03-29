package ch16.sec04;

public class LambdaExample {
    public static void main(String[] args) {
        Person person1 = new Person();

        person1.action((x, y) -> x + y);

        person1.action((x, y) -> sum(x, y));

    }

    public static double sum(double x, double y) {
        return x + y;
    }
}

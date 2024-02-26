package ch04.lecture.p2switch;

import java.util.Arrays;

public class C06Switch {
    public static void main(String[] args) {
        int length = 5;
        String shape = "원"; // 원, 정사각형

        double result = switch (shape) {
            case "원" -> {
                double calc = 3.14 * length * length;
                yield calc; // result에 calc 대입
            }
            case "정사각형" -> length * length;
            default -> 0.0;
        };
    }
}

package ch12.sec10;

import java.util.Arrays;

public class Exam {
    public static void main(String[] args) {
        String str = "aybzc";

        boolean result = str.matches("\\w+");
        System.out.println("result = " + result); // true

        String str2 = str.replaceAll("[y-z]", "x");
        System.out.println("str2 = " + str2); // str2 = axbxc

        String[] arr = str2.split("x");
        System.out.println(Arrays.toString(arr)); // [a, b, c]
    }
}

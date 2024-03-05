package ch06.lecture.p5static;

// static import

import static java.util.Arrays.fill;
import static java.util.Arrays.copyOf;

import java.util.Arrays.*;

public class C03Static {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6};
        int[] brr = new int[5];
        fill(brr, 100);

        int[] crr = copyOf(arr, arr.length);
    }
}

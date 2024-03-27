package 프로그래머스.입문;

import java.util.*;

public class 숨어있는숫자의덧셈 {
    public static void main(String[] args) {
        String my_string = "aAb1B2cC34oOp";
        String[] arr = my_string.split("\\D");

        System.out.println(Arrays.toString(arr));

        int answer = Arrays.stream(arr)
                .filter(x -> !x.equals(""))
                .mapToInt(Integer::valueOf)
                .sum();

        System.out.println(answer);
    }
}

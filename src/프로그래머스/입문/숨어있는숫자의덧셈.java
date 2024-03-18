package 프로그래머스.입문;

import java.util.Arrays;

public class 숨어있는숫자의덧셈 {
    public static void main(String[] args) {
        String my_string = "aAb1B2cC34oOp";
        String[] arr = my_string.split("^[a-zA-Z]*$");
        System.out.println(Arrays.toString(arr));
//        int answer = 0;
//        for (String s : arr) {
//            answer += Integer.parseInt(s);
//        }
//        System.out.println(answer);
    }
}

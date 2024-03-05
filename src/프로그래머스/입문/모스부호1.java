package 프로그래머스.입문;

import java.util.Arrays;

public class 모스부호1 {
    public static void main(String[] args) {
        String[] morse = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};
        String letter = ".... . .-.. .-.. ---";
        String[] arr = letter.split(" ");
        String answer = "";
        char save = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < morse.length; j++) {
                if (arr[i].equals(morse[j])) {
                    System.out.println(arr[i].equals(morse[j]));
                    answer += (char) ('a' + j);
                    System.out.println(answer);
                }
            }
        }
        System.out.println(answer);
    }
}

package ch05.p2string;

public class C10Split {
    public static void main(String[] args) {
        // split :
        // 이 문자열을 주어진 정규 표현식(regular expression)과 일치하는 부분을 기준으로 분리

        String s1 = "hell world";
        String[] word1 = s1.split(" ");

        System.out.println(word1[0]); // hello
        System.out.println(word1[1]); // world
    }
}

package 프로그래머스.입문;

public class 암호해독 {
    public static void main(String[] args) {
        String cipher = "dfjardstddetckdaccccdegk";
        int code = 4;
        char[] cipher2 = cipher.toCharArray();
        String answer = "";
        for (int i = 1; i < cipher.length() + 1; i++) {
            if (i % code == 0) {
                System.out.println(cipher2[i - 1]);
                answer += String.valueOf(cipher2[i - 1]);

            }
        }
        System.out.println(answer);
    }
}

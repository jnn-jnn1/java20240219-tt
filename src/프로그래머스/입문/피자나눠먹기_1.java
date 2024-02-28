package 프로그래머스.입문;

public class 피자나눠먹기_1 {
    public static void main(String[] args) {
        int n = 6;
        int result = 0;
        for (int i = 1; i < 17; i++) {
            for (int j = 1; j <= 6; j++) {
                if ((i * 6) == (n * j)) {
                    result = i;
                    break;
                }

            }
        }
        System.out.println(result);
    }
}

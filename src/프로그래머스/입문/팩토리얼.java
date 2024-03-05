package 프로그래머스.입문;

public class 팩토리얼 {
    public static void main(String[] args) {
        int n = 3628800;
        int i = 0;
        boolean check = true;
        int answer = 0;
        int m = 1;
        int k = 0;
        while (check) {
            for (int j = 1; j <= i; j++) {
                m *= j;
                k = j;
            }
            System.out.println("k: " + k);
            System.out.println("m :" + m);
            if (m >= n) {
                check = false;
                if (m > n)
                    answer = k - 1;
                else answer = k;
            }
            i++;
        }
    }
}

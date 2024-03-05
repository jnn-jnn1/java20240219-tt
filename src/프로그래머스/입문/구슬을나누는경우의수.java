package 프로그래머스.입문;

public class 구슬을나누는경우의수 {
    public static void main(String[] args) {
        int balls = 5;
        int n = balls;
        int n_f = 0;

        for (int i = n; i >= 0; i--) {
            n_f += n * (n - 1);
        }
        
    }
}

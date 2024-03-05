package 프로그래머스.입문;

public class k의개수 {
    public static void main(String[] args) {
        int i = 1;
        int j = 13;
        int k = 1;
        String num = "";
        String c_k = Integer.toString(k);
        int answer = 0;
        for (int m = i; m <= j; m++) {
            num = Integer.toString(m);
            System.out.println("num : " + num);
            System.out.println("c_k : " + c_k);
            if (num.contains(c_k))
                answer++;
        }
    }
}

package 프로그래머스.입문;

public class 이진수더하기 {
    public static void main(String[] args) {
        String bin1 = "10";
        String bin2 = "11";
        int value1 = 0;
        int value2 = 0;
        int result = 0;

        for (int i = bin1.length() - 1; i > -1; i--) {
            if (bin1.charAt(bin1.length() - (i + 1)) == '1') {
                value1 += 1 << i;
            }
        }

        for (int i = bin2.length() - 1; i > -1; i--) {
            if (bin2.charAt(bin2.length() - (i + 1)) == '1') {
                value2 += 1 << i;
            }
        }

        result = value1 + value2;

        System.out.println(Integer.toString(result, 2));
    }
}

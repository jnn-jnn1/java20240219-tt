package 프로그래머스.입문;

public class 숫자찾기 {
    public static void main(String[] args) {
        int num = 232443;
        int k = 4;
        String str_num = Integer.toString(num);
        char str_k = Character.forDigit(k, 10);
        System.out.println("str_k :" + str_k);
        int index = -1;
        for (int i = 0; i < str_num.length(); i++) {
            System.out.println(str_num.charAt(i));
            if (str_num.charAt(i) == str_k)
                index = i + 1;
            break;
        }
        System.out.println("index :" + index);
    }
}

package 프로그래머스.입문;

public class 인덱스바꾸기 {
    public static void main(String[] args) {
        String my_string = "I love you";
        StringBuffer sb = new StringBuffer(my_string);
        int num1 = 3;
        int num2 = 6;
        String[] first = my_string.split("");
        for (int i = 0; i < first.length; i++) {
            if (i != num1 || i != num2)
                sb.append(first[i]);
        }
    }
}

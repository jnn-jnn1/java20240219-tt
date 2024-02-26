package 프로그래머스.입문;

public class 인덱스바꾸기 {
    public static void main(String[] args) {
        String my_string = "I love you";
        int num1 = 3;
        int num2 = 6;
        String first = my_string.substring(num1, num1 + 1);
        String second = my_string.substring(num2, num2 + 1);

        my_string = my_string.insert(num1, second);
        my_string = my_string.insert(num2, first);

        System.out.println(my_string);
    }
}

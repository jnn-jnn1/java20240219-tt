package 프로그래머스.입문;

public class 배열자르기 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int num1 = 1;
        int num2 = 3;
        int[] new_numbers = new int[num2 - num1 + 1];
        int j = 0;

        for (int i = num1; i < num2; i++) {
            new_numbers[j] = numbers[i];
            System.out.println(i);
            System.out.println(j);
            j++;
        }
    }
}

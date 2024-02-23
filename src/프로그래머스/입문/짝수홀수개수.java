package 프로그래머스.입문;

public class 짝수홀수개수 {
    public static void main(String[] args) {
        int num_list[] = {1, 2, 3, 4, 5};
        int even_count = 0;
        int odd_count = 0;
        int[] arr = new int[2];
        for (int check : num_list) {
            if (check % 2 == 0) {
                even_count++;
            } else {
                odd_count++;
            }
            System.out.println(check % 2 == 0);
        }
        arr[0] = even_count;
        arr[1] = odd_count;
        //return arr;
    }
}

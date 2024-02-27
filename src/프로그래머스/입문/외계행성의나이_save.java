package 프로그래머스.입문;

public class 외계행성의나이_save {
    public static void main(String[] args) {
        char[] abc = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i'};
        int age = 53;
        String age_string = Integer.toString(age);
        String[] age_array = age_string.split("");
        String answer = "";
        int[] num = new int[age_array.length];
        for (int i = 0; i < age_array.length; i++) {
            num[i] = Integer.parseInt(age_array[i]);
            answer += abc[num[i]];
        }
    }
}

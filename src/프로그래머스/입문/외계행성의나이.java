package 프로그래머스.입문;

public class 외계행성의나이 {
    public static void main(String[] args) {
        char[] abc = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i'};
        int age = 100;
        int[] age1 = new int[4];
        int i = 0;
        int num = 0;
        int age2 = age;
        if (age2 >= 0) {
            age2 /= 10;
            num++;
        }
        while (true) {
            if (num > 0) {
                age1[i] = age / (10 * num);
                age /= 10;
                i++;
                num--;
                System.out.println("age : " + age);
            } else {
                age1[i] = age % 10;
                break;
            }
        }
        for (int item : age1)
            System.out.println(item);
        String answer = "";
        for (int j = 0; j < i; j++) {
            answer += abc[age1[j]];
        }
    }
}

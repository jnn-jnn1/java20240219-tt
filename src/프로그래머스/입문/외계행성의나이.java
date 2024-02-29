package 프로그래머스.입문;

public class 외계행성의나이 {
    public static void main(String[] args) {
        int age = 1000;
        char[] abc = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j'};
        int age2 = age;
        int count = 0;

        while (age >= 10) {
            age /= 10;
            count++;
            System.out.println("count");
            System.out.println(count);
        }
        int[] age_sp = new int[count + 1];
        String answer = "";

        for (int i = 0; i <= count; i++) {
            if (age2 >= 10) {
                age_sp[i] = age2 / (int) (Math.pow(10, count));
                count--;
                System.out.println("if");
                System.out.println(count);
                System.out.println("age_sp[i]");
                answer += abc[age_sp[i]];
                System.out.println(age_sp[i]);
                System.out.println("abc[]");
                System.out.println(abc[age_sp[i]]);
            } else {
                age_sp[i] = age2 % 10;
                answer += abc[age_sp[i]];
                System.out.println("else");
                System.out.println(age_sp[i]);
            }
        }
        System.out.println(answer);
    }
}

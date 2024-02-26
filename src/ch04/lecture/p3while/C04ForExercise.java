package ch04.lecture.p3while;

public class C04ForExercise {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        int k = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(k);
                k++;
                if (k > 9) {
                    k = 1;
                }
            }
            System.out.println();
        }
    }
}

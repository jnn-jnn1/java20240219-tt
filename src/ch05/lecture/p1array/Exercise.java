package ch05.lecture.p1array;

import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) {
        // 7번 문제
        int[] array = {1, 5, 3, 8, 2};
        int m = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > m)
                m = array[i];
        }
        System.out.println(m);

        System.out.println("-----------------------");

        // 8번 문제
        int[][] array2 = {
                {95, 86},
                {83, 92, 96},
                {78, 83, 93, 87, 88}
        };
        int sum = 0;
        int count = 0;
        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[i].length; j++) {
                sum += array2[i][j];
                count++;
            }
        }
        System.out.println("sum = " + sum);
        System.out.println("avg = " + (double) sum / count);

        System.out.println("-----------------------------");

        // 9번 문제
        Scanner scanner = new Scanner(System.in);
        int[] arr = {};
        int student = 0;
        int score = 0;
        int sum2 = 0;
        int max = 0;
        boolean run = true;

        while (run) {
            System.out.println("-------------");
            System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
            System.out.println("-------------");
            System.out.print("선택>");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1 -> {
                    System.out.print("학생수>");
                    student = scanner.nextInt();
                    arr = new int[student];
                }
                case 2 -> {
                    for (int i = 0; i < student; i++) {
                        System.out.print("score[" + i + "] : ");
                        score = scanner.nextInt();
                        arr[i] = score;
                        sum2 += arr[i];
                        if (max < arr[i])
                            max = arr[i];
                    }
                }
                case 3 -> {
                    for (int i = 0; i < student; i++) {
                        System.out.print("score[" + i + "] : " + arr[i]);
                        System.out.println();
                    }
                }
                case 4 -> {
                    System.out.println("최고 점수 :" + max);
                    System.out.println("평균 점수 :" + (double) sum2 / student);
                }
                case 5 -> {
                    run = false;
                    System.out.println("프로그램 종료");
                }
            }
        }
    }
}

package leetCode;

import java.util.LinkedList;
import java.util.Queue;

public class NumberOfStudentsUnableToEatLunch {
    public static void main(String[] args) {
        int[] students = {1, 1, 0, 0};
        int[] sandwiches = {0, 1, 0, 1};
        Queue<Integer> student = new LinkedList<>();
        Queue<Integer> sandwiche = new LinkedList<>();
        for (int num : students) {
            student.offer(num);
        }
        for (int num : sandwiches) {
            sandwiche.offer(num);
        }

        while (firstSandwich(sandwiche, student)) {
            if (student.element() == sandwiche.element()) {
                student.poll();
                sandwiche.poll();
            } else {
                student.offer(student.poll());
            }
            System.out.println("student = " + student);
            System.out.println("sandwiche = " + sandwiche);
        }
        System.out.println(student.size());
    }

    public static boolean firstSandwich(Queue<Integer> sandwiche, Queue<Integer> student) {
        boolean b = false;
        if (student instanceof LinkedList<Integer> list) {
            for (int i = 0; i < student.size(); i++) {
                if (sandwiche.element() == list.get(i)) {
                    return true;
                }
            }
        }
        return b;
    }
}

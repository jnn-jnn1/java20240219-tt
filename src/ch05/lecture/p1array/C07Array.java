package ch05.lecture.p1array;

public class C07Array {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6};
        // 향상된 for 문
        for (int item : arr) {
            System.out.println(item);
        }
    }
}

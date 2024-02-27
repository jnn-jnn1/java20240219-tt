package ch05.lecture.p1array;

public class C06Array {
    public static void main(String[] args) {
        // 배열 전체 참색
        int[] arr = new int[]{2, 5, 10, 8, 5, 4, 45, 9};

        // for 문 사용
        // 배열의 길이
        System.out.println("arr.length = " + arr.length);
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }
}

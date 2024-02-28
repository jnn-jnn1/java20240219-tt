package ch05.lecture.p1array;

public class C17Matrix {
    public static void main(String[] args) {
        int[][] mat1 = new int[3][2]; // 3행 2열

        // mat1의 원소의 개수는 3개, 그 타입은 int[]
        // mat1각 원소의 원소의 갯수는 2개, 그 타입은 int[]

        System.out.println(mat1.length); //3
        System.out.println(mat1[0].length); //2
    }
}

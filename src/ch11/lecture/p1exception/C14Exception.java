package ch11.lecture.p1exception;

public class C14Exception {

    public static void main(String[] args) {
        try {
            int result = divide(10, 0);
            System.out.println("결과: " + result);
        } catch (ArithmeticException e) {
            System.out.println("0으로 나눌 수 없습니다.");
        } finally {
            System.out.println("finally 블록 실행");
        }
    }

    public static int divide(int num1, int num2) {
        return num1 / num2;
    }
    

}

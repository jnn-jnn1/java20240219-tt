package ch06.lecture.p2method;

public class C04Parameter {
    public static void main(String[] args) {
        C04Calculator cal = new C04Calculator();

        cal.printSum(5, 7);
        cal.printSum(9, 13);
        cal.printSum(200, 300);

        cal.printDivide(3.14, 0.5);
        cal.printDivide(9.0, 3);
        cal.printDivide(10, 2);

        // Debug mode : F8 누르면 브레이크 포인트에서 다음 단계 실행
        // Step over click(F7) : 함수 안으로 들어가고 싶으면
        // Step out : 빠져나오고 싶으면
    }
}

class C04Calculator {
    void printSum(int a, int b) {
        int result = a + b;
        System.out.println(result);
    }

    void printDivide(double a, double b) {
        double result = a / b;
        System.out.println(result);
    }
}

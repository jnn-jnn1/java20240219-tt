package ch06.sec08.exam02;

public class Computer {
    int sum(int... values) {
        int sum = 0;

        // values 는 배열 타입의 변수처럼 사용
        for (int i = 0; i < values.length; i++) {
            sum += values[i];
        }

        return sum;
    }
}

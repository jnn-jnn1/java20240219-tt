package ch11.lecture.p1exception;

import java.util.List;

public class C04TryCatch {
    public static void main(String[] args) {
        List<String> list = List.of("a", "b");

        try {
            System.out.println(list.get(2));

            System.out.println("원소 출력됨");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("예외 발생 시 실행되는 코드들");
        }
        System.out.println("프로그램 종료");
    }
}

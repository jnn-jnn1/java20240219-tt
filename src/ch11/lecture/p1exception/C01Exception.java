package ch11.lecture.p1exception;

import java.util.List;

public class C01Exception {
    public static void main(String[] args) {
        // Exception : 예외가 발생했을 때 나오는 객체의 타입
        // Runtime Exception : unchecked exception
        //                      컴파일러가 검사 안 함
        // Runtime Exception 외 : checked exception
        //                      컴파일러가 검사함

        List<String> list = List.of("css", "html");
        System.out.println(list.get(2));
    }
}

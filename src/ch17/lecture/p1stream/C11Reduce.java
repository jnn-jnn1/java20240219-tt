package ch17.lecture.p1stream;

import java.util.List;
import java.util.Optional;

public class C11Reduce {
    public static void main(String[] args) {
        // reduce : reduction 연산

        List<String> list = List.of("java", "css", "spring", "html");

        // "javacssspringhtml"
        String reduce = list.stream()
                .reduce("", (result, e) -> result + e); // 초기값, apply재정의 (이전값 , 새로운 값)
        System.out.println("reduce = " + reduce);


        List<Integer> list1 = List.of(3, 6, 9, 10);
        // sum
        Integer reduce1 = list1.stream()
                .reduce(0, (s, v) -> s + v);
        System.out.println("reduce1 = " + reduce1);

        List<Integer> list2 = List.of();

        Optional<Integer> reduce2 = list2
                .stream()
                .reduce((a, b) -> a + b);

        System.out.println(reduce2);
    }
}

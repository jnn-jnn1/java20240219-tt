package ch17.lecture.p1stream;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class C02Terminal {
    public static void main(String[] args) {
        // 최종연산
        // forEach, collect, count, reduce
        // anyMatch, allMatch
        // max, min

        // Stream 만들기
        List<Integer> list = List.of(9, 8, 0, 10, 1, 90);
        Stream<Integer> stream = list.stream();
        stream.forEach(System.out::println);

        list.stream()
                .forEach(System.out::println);

//        stream.count();
        long count = list.stream()
                .count();
        System.out.println(count);

//        stream.max();
        Optional<Integer> max = list.stream()
                .max((a, b) -> a = b);
        System.out.println("max = " + max);

        // stream.main()
        Optional<Integer> min = list.stream()
                .min((a, b) -> a - b);
        System.out.println("min = " + min);
    }
}

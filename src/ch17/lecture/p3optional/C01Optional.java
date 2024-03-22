package ch17.lecture.p3optional;

import java.util.Optional;

public class C01Optional {
    public static void main(String[] args) {
        // Optional
        // null이 아닌 값을 포함할 수 있는 컨테이너

        Optional<String> s = Optional.of("java");
        Optional<Integer> i = Optional.of(3);
//        Optional<Object> o = Optional.of(null); 안됨

        Optional<Object> empty = Optional.empty();

        // 값이 있는지?
        boolean b1 = s.isPresent();

        // 값이 없는지?
        boolean b2 = s.isEmpty(); // false
        boolean b3 = empty.isEmpty(); // true

        // 값을 꺼내기
        String s1 = s.get();
        Integer i1 = i.get();

        // 값이 없을 때 꺼내기
        String s2 = s.orElse("");  // "java"
        Integer i2 = i.orElse(0); // 3

    }
}

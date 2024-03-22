package ch17.exercise.p7;

import java.util.*;
import java.util.stream.Collectors;

public class Example {
    public static void main(String[] args) {
        List<Member> list = Arrays.asList(
                new Member("홍길동", "개발자"),
                new Member("김나리", "디자이너"),
                new Member("신용권", "개발자")
        );

//        List<Member> developers = list.stream()
//                .collect(() -> new ArrayList<Member>(), (c, e) -> {
//                    if (e.getJob().equals("개발자")) {
//                        c.add(e);
//                    }
//                }, (a, b) -> a.addAll(b));

        List<Member> developers = list.stream()
                .filter(x -> x.getJob().equals("개발자"))
                .collect(Collectors.toList());

        developers
                .forEach((x) -> System.out.println(x.getName()));
    }
}

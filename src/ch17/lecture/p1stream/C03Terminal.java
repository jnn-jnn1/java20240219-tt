package ch17.lecture.p1stream;

import java.util.List;

public class C03Terminal {
    public static void main(String[] args) {
        List<String> list = List.of("java", "css", "react", "spring", "hello", "world");
        // 최종 연산

        // anyMatch
        boolean hasCss = list.stream()
                .anyMatch(e -> e.equals("css"));
        System.out.println("hasCss = " + hasCss);

        // allMatch
        boolean threeAndMore = list.stream()
                .allMatch(e -> e.length() >= 3);
        System.out.println("threeAndMore = " + threeAndMore);

        
    }
}

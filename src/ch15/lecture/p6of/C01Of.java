package ch15.lecture.p6of;

import java.util.ArrayList;
import java.util.List;

public class C01Of {
    public static void main(String[] args) {
        //
        List<String> list = new ArrayList<>();
        list.add("java");
        list.add("css");
        list.add("html");
        list.add("recat");
        System.out.println(list);

        // of 로 만든 리스트는 수정 불가
        List<String> list2 = List.of("java", "css", "html", "react");
        System.out.println(list2);
    }
}

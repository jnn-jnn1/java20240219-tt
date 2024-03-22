package ch15.lecture.p5map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.*;
import java.util.Map.Entry;


public class C01Map {
    public static void main(String[] args) {
        // map : entry (key, value)를 저장
        // 같은 key를 가진 두 개의 entry를 저장할 수 없음

        Map<String, String> map = new HashMap<>();

        // entry 추가
        map.put("java", "programming language");
        map.put("css", "style sheet");
        map.put("html", "hypertext markup language");
        map.put("spring", "java framework");
        map.put("react", "frontend library");
        map.put("css", "style sheet");

        // map 크기
        System.out.println(map.size()); // 5

        // entry 검색
        boolean b1 = map.containsKey("java"); // true
        boolean b2 = map.containsKey("css"); // true
        boolean b3 = map.containsKey("jsp"); // false
        System.out.println("b1 = " + b1);
        System.out.println("b2 = " + b2);
        System.out.println("b3 = " + b3);

        // entry의 value 얻기
        String value1 = map.get("java");
        String value2 = map.get("react");
        String value3 = map.get("jsp");
        System.out.println("value1 = " + value1);
        System.out.println("value2 = " + value2);
        System.out.println("value3 = " + value3); // null

        // entry 수정
        map.put("java", "프로그래밍 언어");
        String value4 = map.get("java");
        System.out.println("value4 = " + value4);

        if (map.containsKey("css")) {
            map.put("css", "스타일 시트");
        }

        if (map.containsKey("jsp")) {
            map.put("jsp", "java server page");
        }
        System.out.println(map.get("css"));
        System.out.println(map.get("jsp"));

        // entry 지우기
        System.out.println(map.size());
        String value6 = map.remove("css");
        System.out.println("value6 = " + value6);
        System.out.println(map.size());
        String value7 = map.remove("jsp");
        System.out.println("value7 = " + value7);
        System.out.println(map.size());

        // 전체탐색
        // 1.keySet
        System.out.println("#####keySet && 향상된 for 활용");
        Set<String> keys = map.keySet();
        // enhanced for
        for (String key : keys) {
            System.out.println(key + ":" + map.get(key));
        }
        System.out.println();
        // forEach
        System.out.println("##### forEach문 활용");
        keys.forEach((x) -> System.out.println(x + "," + map.get(x)));
        System.out.println();
        // iterator
        System.out.println("#####Iterator 사용");
        Iterator<String> iterator = keys.iterator();
        while (iterator.hasNext()) {
            String k = iterator.next();
            String v = map.get(k);
            System.out.println(k + "," + v);
        }
        System.out.println();


        // 2. entrySet
        System.out.println("##### entrySet && 향상된 for문 활용");
        // enhanced for
        Set<Map.Entry<String, String>> entries = map.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
        System.out.println();

        // forEach
        System.out.println("##### entrySet && forEach 문");
        entries.forEach((x) -> System.out.println(x.getKey() + " , " + x.getValue()));
        System.out.println();

        // iterator
        System.out.println("##### entrySet && Iterator");
        Set<Entry<String, String>> entrySet = map.entrySet();
        Iterator<Entry<String, String>> iterator1 = entries.iterator();
        while (iterator1.hasNext()) {
            Entry<String, String> entry = iterator1.next();
            String k = entry.getKey();
            String v = entry.getValue();
            System.out.println(k + "," + v);
        }

        // 3. forEach

        map.forEach((k, v) -> System.out.println(k + "," + v));
    }
}

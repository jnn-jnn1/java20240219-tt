package ch02.lecture.p02type;

public class C28Printf {
    public static void main(String[] args) {
        // 첫 번째 파라미터 문자열에 n번째 파라미터를 포함해서 출력
        System.out.printf("hello %s", "jane");
        System.out.println();
        System.out.printf("hello %s and %s", "son", "park");

        String a = "son";
        String b = "park";

        System.out.println(STR."hello\{a} and \{b}");
    }
}

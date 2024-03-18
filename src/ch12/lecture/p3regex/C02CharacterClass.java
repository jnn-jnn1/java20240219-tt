package ch12.lecture.p3regex;

public class C02CharacterClass {
    public static void main(String[] args) {
        // 문자집합
        System.out.println("a".matches("[abc]")); // true
        System.out.println("b".matches("[abc]")); // true
        System.out.println("c".matches("[abc]")); // true
        System.out.println("A".matches("[abc]")); // false

        System.out.println("abc".matches("[abc]")); //false

        String p1 = "[abc][abc][abc]";
        System.out.println("abc".matches(p1)); // true
        System.out.println("bac".matches(p1)); // true
        System.out.println("aba".matches(p1)); // true
        System.out.println("cab".matches(p1)); // true
        System.out.println("cbc".matches(p1)); // true
        System.out.println("bbb".matches(p1)); // true
        System.out.println("ccc".matches(p1)); // true

        String p2 = "[a-z]";
        System.out.println("a".matches(p2)); // true
        System.out.println("s".matches(p2)); // true
        System.out.println("z".matches(p2)); // true
        System.out.println("A".matches(p2)); // false

        String p3 = "[a-zA-z]"; // 소문자전체, 대문자전체
        System.out.println("s".matches(p3)); // true
        System.out.println("S".matches(p3)); // true

        String p4 = "[a-zA-z0-9]"; // 소문자전체, 대문자전체, 숫자
        String p5 = "[가-힣]"; // 한글 한글자

        String p6 = "[^abc]"; // a, b, c, 외
        System.out.println("a".matches(p6)); // false
        System.out.println("d".matches(p6)); // true
        System.out.println("A".matches(p6)); // true
        System.out.println("0".matches(p6)); // true
        System.out.println("xyz".matches(p6)); // false
    }
}

package ch12.lecture.p3regex;

public class C04Quantifier {
    public static void main(String[] args) {
        // 수량자
        // {n} : 정확히 n번
        // {n,m} : n~m 번
        // {n,} : n번 이상
        // + : {1,} : 1번 이상
        // * : {0,}, 0번 이상
        // ? : {0,1} : 한번 또는 없음

        // {n} : n번
        String p1 = "\\d{3}";
        System.out.println("012".matches(p1)); // true
        System.out.println("01z".matches(p1)); // false
        System.out.println("0".matches(p1)); // false

        String p2 = "010-\\d{4}-\\d{4}";
        System.out.println("010-1234-5678".matches(p2)); // true
        System.out.println("999-1234-5678".matches(p2)); // false
        System.out.println("999-123-5678".matches(p2)); // false
        System.out.println("999-12345678".matches(p2)); // false

        // {n,m}
        String p3 = "[가-힣]{3,4}";
        System.out.println("손흥민".matches(p3)); // true
        System.out.println("이강인".matches(p3)); // true
        System.out.println("대한민국".matches(p3)); // true
        System.out.println("한국".matches(p3)); // false

        // {n,}
        String p4 = "[가-힣]{2,}";
        System.out.println("손흥민".matches(p4)); // true
        System.out.println("이강인".matches(p4)); // true
        System.out.println("대한민국".matches(p4)); // true
        System.out.println("한국".matches(p4)); // true
        System.out.println("한".matches(p4)); // false
        System.out.println("한국seoul".matches(p4)); // false

        String p5 = "[a-zA-z가-힣]+";
        System.out.println("한국".matches(p5)); // true
        System.out.println("Korea".matches(p5)); // true
        System.out.println("한국seoul".matches(p5)); // true
        System.out.println("한국 seoul".matches(p5)); // false

        // ? : {0,1}
        String p6 = "010-?\\d{4}-?\\d{4}";
        System.out.println("010-1111-2222".matches(p6)); // true
        System.out.println("01011112222".matches(p6)); // true

        // + : 1번 이상
        String p7 = "\\w+";
        System.out.println("983jf_".matches(p7)); // true
        System.out.println(" ".matches(p7)); // false
    }
}

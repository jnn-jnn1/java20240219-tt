package ch05.p2string;

public class C05Replace {
    public static void main(String[] args) {
        // replace : 특정 문자열을 바꾼 문자열을 리턴 ( 원본 문자열이 바뀌지 않음)
        String u = "java, spring, css, java, html";
        String v = u.replace("java", "자바");
        System.out.println(u);
        System.out.println(v);

    }
}

package ch12.lecture.p3regex;

public class C05Sample {
    public static void main(String[] args) {
        // _, $, 영문대소문자, 숫자 조합
        // 단 숫자로 시작하면 안됨

//        String pattern = "[\\D][\\w$]+";
        String pattern = "^(?![0-9])[A-Za-z0-9_S]+$";
        System.out.println("num".matches(pattern));
        System.out.println("var7".matches(pattern));
        System.out.println("class".matches(pattern));
        System.out.println("PI".matches(pattern));
        System.out.println("MAX_VALUE".matches(pattern));
        System.out.println("7num".matches(pattern));
    }
}

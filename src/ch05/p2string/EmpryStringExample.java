package ch05.p2string;

public class EmpryStringExample {
    public static void main(String[] args) {
        String hobby = "";

        if (hobby.equals("")) {
            System.out.println("hobby 변수가 참조하는 String 객체는 빈 문자열");
        }

        if (hobby.isEmpty()) {
            System.out.println("hobby 변수가 참조하는 String 객체는 빈 문자열");
        }

        if (hobby.isBlank()) {
            System.out.println("hobby 변수가 참조하는 String 객체는 빈 문자열");
        }
    }
}

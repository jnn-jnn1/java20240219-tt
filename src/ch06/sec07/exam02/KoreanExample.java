package ch06.sec07.exam02;

public class KoreanExample {
    public static void main(String[] args) {
        Korean k1 = new Korean("박자바", "011225-1234567");

        System.out.println("국적 : " + k1.nation);
        System.out.println("이름 : " + k1.name);
        System.out.println("주민번호 : " + k1.ssn);

        Korean k2 = new Korean("김자바", "930525-0654321");

        System.out.println("국적 : " + k2.nation);
        System.out.println("이름 : " + k2.name);
        System.out.println("주민번호 : " + k2.ssn);

    }
}

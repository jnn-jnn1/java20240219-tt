package ch05.lecture.p1array;

public class GarbageObjectExample {
    public static void main(String[] args) {
        String hobby = "여행";
        hobby = null;

        String kind1 = "자동차";
        String kind2 = kind1;
        kind1 = null; // "자동차"에 해당하는 String 객체는 쓰레기가 아님
        System.out.println("kind2 = " + kind2);
    }
}

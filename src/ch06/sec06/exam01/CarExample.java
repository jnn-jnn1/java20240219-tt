package ch06.sec06.exam01;

public class CarExample {
    public static void main(String[] args) {
        // Car 객체 생성
        Car myCar = new Car();

        // Car 객체의 필드값 읽기
        System.out.println("모델명 : " + myCar.model); // null
        System.out.println("시동여부 : " + myCar.start); // false
        System.out.println("현재속도 : " + myCar.speed); // 0

        // 초기값을 제공하지 않을 경우 필드는 객체 생성 시 자동으로 기본값으로 초기화
    }
}

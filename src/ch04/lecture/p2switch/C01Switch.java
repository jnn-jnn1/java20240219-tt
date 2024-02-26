package ch04.lecture.p2switch;

public class C01Switch {
    public static void main(String[] args) {

        System.out.println("statement 1");

        // 결과 : statement 2
        //       statement 3
        //       statement 4

        switch ("서울") {
            case "서울":
                System.out.println("statement 2");

            case "제주":
                System.out.println("statement 3");

            case "부산":
                System.out.println("statement 4");

        }

        System.out.println("statement 5");
        System.out.println("statement 6");
        System.out.println("statement 7");
        System.out.println("statement 8");
        System.out.println("statement 9");

    }
}

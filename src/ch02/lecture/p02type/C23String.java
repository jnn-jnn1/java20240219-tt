package ch02.lecture.p02type;

public class C23String {
    public static void main(String[] args) {
        // 참조타입 String
        // 기본타입 <-> 참조타입간의 형변환 안됨

        // 1. 기본타입 <-> String 간의 변환은 메소드로 가능
        String a = "123";
        byte b = Byte.parseByte(a);
        short c = Short.parseShort(a);
        int e = Integer.parseInt((a));
        long f = Long.parseLong(a);
        float g = Float.parseFloat(a);
        double h = Double.parseDouble(a);

        // 2. 기본타입 -> String 변환
        int k = 356;
        double l = 3.14;

        String m = String.valueOf(k);
        String n = String.valueOf(l);

        String o = k + ""; // String과 다른 타입간 더하기(+) 연산의 결과는 String
        String p = l + "";

    }
}

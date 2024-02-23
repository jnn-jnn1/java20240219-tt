package ch02.lecture.p02type;

public class C20TypeConversion {
    public static void main(String[] args) {
        // 정수형 : byte(1), short(2), int(4), long(8)

        // 정수형을 실수형에 할당 가능
        long p = 1234;
        float q = p;
        double r = p;

        byte byteValue = 10;
        int intValue = byteValue;
        System.out.println("intValue :" + intValue);

        char charValue = '가';
        intValue = charValue;
        System.out.println(STR."가의 유니코드 :\{intValue}");

        intValue = 50;
        long longValue = intValue;
        System.out.println(STR."longValue :\{intValue}");

        longValue = 100;
        float floatValue = longValue;
        System.out.println(STR."floatValue :\{floatValue}");

        floatValue = 100.5F;
        double doubleValue = floatValue;
        System.out.println(STR."doubleValue :\{doubleValue}");
    }
}

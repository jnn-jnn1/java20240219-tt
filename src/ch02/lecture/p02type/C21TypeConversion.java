package ch02.lecture.p02type;

public class C21TypeConversion {
    public static void main(String[] args) {
        // 자동타입변환 : 작은크기 -> 큰크기
        // 강제타입변환(casting) : 큰크기 -> 작은크기

        long a = 234;
        int b = (int) a;

        System.out.println("a :" + a);
        System.out.println("b :" + b);

        short c = 50;
        byte d = (byte) c;
        System.out.println("c :" + c);
        System.out.println("d :" + d);

        short e = 128;
        byte f = (byte) e;
        System.out.println("e :" + e);
        System.out.println("f :" + f);

        int var1 = 10;
        byte var2 = (byte) var1;
        System.out.println(var2);

        long var3 = 300;
        int var4 = (int) var3;
        System.out.println(var4);

        int var5 = 65;
        char var6 = (char) var5;
        System.out.println(var5);

        double var7 = 3.14;
        int var8 = (int) var7;
        System.out.println(var8);

        int intValue = 10;
        char charValue = 'A';
        double doubleValue = 5.7;
        //     String strValue = "A";

        double var = (double) intValue;
        byte var_2 = (byte) intValue;
        int var_3 = (int) doubleValue;
        //     char var_4 = (char) strValue;


    }
}

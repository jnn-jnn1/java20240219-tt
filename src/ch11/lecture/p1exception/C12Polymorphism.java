package ch11.lecture.p1exception;

import java.util.List;

public class C12Polymorphism {
    public static void main(String[] args) {
        try {
            Class.forName("java.lang.String");
            List.of().get(0);
            Integer.parseInt("hundred");
        } catch (NumberFormatException e) {
            System.out.println("코드2");
        } catch (Exception e) {
            System.out.println("코드1");
        }
    }
}

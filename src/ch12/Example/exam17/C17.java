package ch12.Example.exam17;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.regex.Pattern;

public class C17 {
    public static void main(String[] args) {
        String id = "5Angel1104";
        String regExp = "[a-zA-z][a-zA-Z0-9]{7,11}}";
        boolean isMatch = Pattern.matches(regExp, id);
        if (isMatch) {
            System.out.println("ID로 사용할 수 있습니다");
        } else {
            System.out.println("ID로 사용할 수 없습니다");
        }

        String myString = "xabcxxx";

        myString = myString.replaceAll("x+", "x");
        String[] arr = myString.split("x");
        System.out.println(Arrays.toString(arr));
    }
}

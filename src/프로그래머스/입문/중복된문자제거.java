package 프로그래머스.입문;

public class 중복된문자제거 {
    public static void main(String[] args) {
        String my_string = "people";
        String str = "";
        String str2 = "";
        String str3 = "";
        String str4 = "";
        String answer = "";
        for (int i = 0; i < my_string.length(); i++) {
            str = my_string.substring(i + 1);
            str3 = Character.toString(my_string.charAt(i));
            str4 = str.replaceAll(str3, "");
            System.out.println("str3 = " + str3);
            System.out.println("str4 = " + str4);
            str2 = my_string.substring(0, i);
            System.out.println("str2 = " + str2);
            my_string = str2 + my_string.charAt(i) + str;
            System.out.println("my_string = " + my_string);
        }
    }
}

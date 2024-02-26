package ch04.lecture.p3while;

public class C03Debug {
    public static void main(String[] args) {
        String my_string = "aAb1B2cC34oOp";
        String restr = my_string.replaceAll("[^0-9]", "");

        int answer = 0;
        for (int i = 0; i < restr.length(); i++) {
            int num = (int) (restr.charAt(i));
            System.out.println(num);
            answer += num;
        }

    }
}

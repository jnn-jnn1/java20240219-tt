package 프로그래머스.입문;

public class A로B만들기 {
    public static void main(String[] args) {
        String before = "olleh";
        String after = "hello";
        char[] before1 = before.toCharArray();
        char[] after1 = after.toCharArray();
        int checka = 0;
        int checkb = 0;
        int count = 0;

        for (int i = 0; i < before1.length; i++) {
            for (int j = 0; j < after1.length; j++) {
                if (before1[i] == after1[j]) {
                    count++;
                    break;
                }


            }
            checkb += (int) before1[i];
            System.out.println("before:" + before1[i]);
            checka += (int) after1[i];
            System.out.println("after :" + after1[i]);

        }
        System.out.println(checka);
        System.out.println(checkb);
        int answer = count == before1.length && checkb == checka ? 1 : 0;
        System.out.println(count);
        System.out.println(answer);
    }
}

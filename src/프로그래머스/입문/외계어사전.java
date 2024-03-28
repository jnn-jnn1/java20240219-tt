package 프로그래머스.입문;

import java.util.*;

public class 외계어사전 {
    public static void main(String[] args) {
        String[] spell = {"z", "d", "x"};
        String[] dic = {"def", "dww", "dzx", "loveaw"};
        List<List<String>> list = new ArrayList<>();
        int cnt = 0;

        for (String str : dic) {
            list.add(Arrays.asList(str.split("")));
        }

        for (int i = 0; i < dic.length; i++) {
            for (int j = 0; j < spell.length; j++) {
                if (list.get(i).contains(j)) cnt++;
                System.out.println(list.get(i));
            }
        }

        System.out.println(cnt);
    }
}

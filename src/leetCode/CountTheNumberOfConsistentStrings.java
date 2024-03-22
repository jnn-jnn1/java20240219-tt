package leetCode;

import java.util.ArrayList;
import java.util.*;

public class CountTheNumberOfConsistentStrings {
    public static void main(String[] args) {
        String allowed = "ab";
        String[] words = {"ad", "bd", "aaab", "baa", "badab"};
        List<Character> list = new ArrayList<>();
        List<Set<Character>> setList = new ArrayList<>();
        int cnt = 0;
        for (int i = 0; i < allowed.length(); i++) {
            list.add(allowed.charAt(i));
        }

        for (int i = 0; i < words.length; i++) {
            Set<Character> set = new HashSet<>();
            for (int j = 0; j < words[i].length(); j++) {
                set.add(words[i].charAt(j));
            }
            System.out.println(set + "," + i);
            setList.add(set);
        }

        for (Set s : setList) {
            int num = 0;
            for (int i = 0; i < list.size(); i++) {
                if (s.contains(list.get(i))) {
                    num++;
                }
            }
            if (num >= list.size()) {
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}

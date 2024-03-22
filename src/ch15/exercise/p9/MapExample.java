package ch15.exercise.p9;

import java.util.*;

public class MapExample {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("blue", 96);
        map.put("hong", 86);
        map.put("white", 92);

        String name = null;
        int maxScore = 0;
        int totalScore = 0;

        Set<String> set = map.keySet();
        for (String s : set) {
            int score = map.get(s);
            totalScore += score;
            if (score > maxScore) {
                name = s;
                maxScore = score;
            }
        }

        System.out.println("평균 점수 :" + totalScore / map.size());
        System.out.println("최고 점수 :" + maxScore);
        System.out.println("최고 점수를 받은 아이디" + name);
    }
}

package leetCode;

import java.util.*;

public class SumOfUniqueElement {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 2};

        Map<Integer, Integer> map = new HashMap<>();
        int sum = 0;

        for (int num : nums) {
            if (!map.containsKey(num)) {
                map.put(num, 1);
            } else {
                map.put(num, 2);
            }
        }
        Set<Integer> set = map.keySet();
        for (int s : set) {
            System.out.println(s);
            System.out.println(map.get(s));
            if (map.get(s) == 1) {
                sum += s;
            }
        }
        System.out.println(sum);
    }
}

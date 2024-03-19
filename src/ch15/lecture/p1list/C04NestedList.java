package ch15.lecture.p1list;

import java.util.ArrayList;
import java.util.List;

public class C04NestedList {
    public static void main(String[] args) {
        int[][] array = {
                {95, 86},
                {83, 92, 96},
                {78, 83, 93, 87, 88}
        };

        System.out.println(array[1][1]); // 93
        System.out.println(array[2][2]); // 93
        System.out.println(array[1][0]); // 83

        List<List<Integer>> list = new ArrayList<>();

        List<Integer> elist1 = new ArrayList<>();
        elist1.add(95);
        elist1.add(86);

        list.add(elist1);

        List<Integer> elist2 = new ArrayList<>();
        elist2.add(83);
        elist2.add(92);
        elist2.add(96);

        list.add(elist2);

        list.add(new ArrayList<>());
        list.get(2).add(78);
        list.get(2).add(83);
        list.get(2).add(93);

        System.out.println(list.get(1).get(1)); // 92
        System.out.println(list.get(2).get(2)); // 93
        System.out.println(list.get(1).get(0)); // 83

    }
}

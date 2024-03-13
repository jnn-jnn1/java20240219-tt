package ch16.Example.exam07;

public class Example {
    private static int[] scores = {10, 50, 3};

    public static int maxorMin(Operater operater) {
        int result = scores[0];
        for (int score : scores) {
            result = operater.apply(result, score);
        }
        return result;
    }

    public static void main(String[] args) {
        int max = maxorMin(Math::max);

        System.out.println("최대값 :" + max);

        int min = maxorMin(Math::min);

        System.out.println("최소값 :" + min);
    }
}

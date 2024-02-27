package 프로그래머스.입문;

public class 배열회전시키기 {
    public static void main(String[] args) {
        int[] numbers = new int[]{4, 455, 6, 4, -1, 45, 6};
        String direction = "left";
        int m = 0;
        if (direction.equals("left")) {
            for (int i = 0; i < numbers.length; i++) {
                if (i != numbers.length - 1) {
                    m = numbers[i + 1];
                    numbers[i + 1] = numbers[i];
                    numbers[i] = m;
                } else {
                    m = numbers[i - 1];
                    numbers[i - 1] = numbers[i];
                    numbers[i] = m;
                }
                for (int item : numbers) {
                    System.out.print(+item + " ");
                }
                System.out.println();
            }
        }
    }
}

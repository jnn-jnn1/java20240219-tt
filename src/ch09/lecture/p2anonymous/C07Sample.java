package ch09.lecture.p2anonymous;

import java.util.Arrays;
import java.util.Random;

public class C07Sample {
    public static void main(String[] args) {
        // TODO : null 대신 익명클래스 객체 코드 생성

        Game rpsGame = new Game() {
            @Override
            public void play() {
                int num = (int) (Math.random() * 3) + 1;
                switch (num) {
                    case 1 -> System.out.println("가위");
                    case 2 -> System.out.println("바위");
                    case 3 -> System.out.println("보");
                }
            }
        };
        rpsGame.play(); // "가위", :바위", "보, 중 하나 출력

        Game lottoGame = new Game() {
            @Override
            public void play() {
                int[] arr = new int[6];
                int size = 0;
                Random random = new Random();
                while (size < 6) {
                    int num = random.nextInt(45) + 1;
                    boolean arealdyHave = false;

                    for (int i = 0; i < size; i++) {
                        if (num == arr[i]) {
                            arealdyHave = true;
                            break;
                        }
                    }

                    if (!arealdyHave) {
                        arr[size] = num;
                        size++;
                    }
                }
                System.out.println(Arrays.toString(arr));
            }
        };
        // 초보자 : 1~45 값 중 하나 출력
        // 중급자 : 1~45값 중 6개 중복없이 출력
        lottoGame.play();
    }
}

interface Game {
    void play();
}

package ch14.lecture.p2currency;

public class C09Sleep {
    public static void main(String[] args) {
        Thread threadA = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("ThreadA 실행");
                try {
                    // 3초 일시정지 후 실행
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                }
            }
        });
    }
}

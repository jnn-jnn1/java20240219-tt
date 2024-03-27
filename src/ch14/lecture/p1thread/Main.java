package ch14.lecture.p1thread;

public class Main {

    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            System.out.println("Anonymous Runnable is running");
        });

        thread.start();  // 쓰레드 실행
    }
}

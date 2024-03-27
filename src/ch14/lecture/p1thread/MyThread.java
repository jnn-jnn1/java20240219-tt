package ch14.lecture.p1thread;

public class MyThread extends Thread {

    @Override
    public void run() {
        System.out.println("MyThread is running");
    }

    public static void main(String[] args) {
        MyThread myThread = new MyThread();  // Thread 객체 생성
        myThread.start();  // 쓰레드 실행
    }
}

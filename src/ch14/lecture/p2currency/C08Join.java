package ch14.lecture.p2currency;

class SumThread extends Thread {
    private long sum;

    public long getSum() {
        return sum;
    }

    @Override
    public void run() {
        for (int i = 0; i <= 10; i++) {
            sum += i;
        }
    }
}

public class C08Join {
    public static void main(String[] args) throws InterruptedException {
        SumThread threadA = new SumThread();

        // threadA 실행
        threadA.start();
        // Main 스레드를 대기 상태로 만듬
        threadA.join();

        // threadA 종료 후 Main 스레드 실행
        System.out.println(threadA.getSum());
    }
}

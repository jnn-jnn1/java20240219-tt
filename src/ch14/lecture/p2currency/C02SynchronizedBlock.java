package ch14.lecture.p2currency;

public class C02SynchronizedBlock {
    public static void main(String[] args) throws InterruptedException {
        MyObject2 o = new MyObject2();
        o.setLock(o);
        Thread t1 = new Thread(o);
        Thread t2 = new Thread(o);

        t1.start();
        t2.start();

        t1.join();
        t2.join();
    }
}

class MyObject2 implements Runnable {
    @Override
    public void run() {
        update();
    }

    private long value;
    private Object lock;

    public void setLock(Object o) {
        this.lock = o;
    }

    public void update() {
        for (int i = 0; i < 30000; i++) {
            // synchronized block
            // () 괄호 안의 객체를 차지한 쓰레드만 실행 가능
            synchronized (lock) {
                value++;
            }
        }
    }

    public long getValue() {
        return value;
    }
}

package ch06.sec14;

public class Car {
    private int speed;
    private boolean stop;

    public int getSpeed() {
        return speed;
    }

    public boolean isStop() {
        return stop;
    }

    public void setSpeed(int speed) {
        if (speed < 0) {
            this.speed = 0;
            return;
        }
        this.speed = speed;
    }

    public void setStop(boolean stop) {
        this.stop = stop;
        if (stop == true) this.speed = 0;
    }
}

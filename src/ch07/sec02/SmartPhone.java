package ch07.sec02;

public class SmartPhone extends Phone {
    public boolean wifi;

    public SmartPhone(String model, String color) {
        this.model = model;
        this.color = color;
    }

    public void setWifi(boolean wifi) {
        this.wifi = wifi;
        System.out.println("와이파이 상태를 변경했습니다");
    }

    public void internet() {
        if (wifi == true)
            System.out.println("인터넷에 연결합니다");
        else System.out.println("인터넷에 연결되어 있지 않습니다");
    }
}

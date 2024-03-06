package ch06.sec08.finalExam;

public class ShopService {
    private static ShopService s1 = new ShopService();

    private ShopService() {

    }

    public static ShopService getInstance() {
        return s1;
    }
}

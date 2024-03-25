package ch11.lecture.p2throw;

public class C04Throw {
    public static void main(String[] args) {
        try {
            mehtod1();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void mehtod1() throws ReflectiveOperationException {
        throw new ClassNotFoundException();
    }
}

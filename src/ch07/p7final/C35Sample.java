package ch07.p7final;

public class C35Sample {
    public static void main(String[] args) {
        Shape shape1 = new Round(3);
        Shape shape2 = new Rectangle(5, 7); // 가로 5, 세로 7
        shape1.printArea(); // 원의 면적 출력 "28.2748"
        shape2.printArea(); // 사각형의 면적 출력 "35"

        printDescription(shape1); // "반지름이 3인원의 면적은 28.2748입니다."
        printDescription(shape2); // "가로 5, 세로 7인 사각형의 면적은 35입니다."
    }

    public static void printDescription(Object o) {
        System.out.println(o.toString());
    }
}

class Shape {
    int width;
    int height;

    public void printArea() {
        System.out.println("넓이 출력");
    }

    public String toString() {
        return STR."넓이";
    }


}

class Round extends Shape {
    double areaCircle;

    public Round(int width) {
        this.width = width;
        areaCircle = width * width * Math.PI;
    }

    @Override
    public void printArea() {
        System.out.println("원의 면적 출력 " + areaCircle);
    }

    @Override
    public String toString() {
        return "반지름이 3인원의 면적은 " + areaCircle + "입니다.";
    }
}

class Rectangle extends Shape {
    int areaRectangle;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
        areaRectangle = width * height;
    }

    @Override
    public void printArea() {
        System.out.println("사각형의 면적 출력: " + areaRectangle);
    }

    @Override
    public String toString() {
        return STR."가로\{width} ,세로\{height}인사각형의 넓이는 \{areaRectangle}입니다";
    }
}

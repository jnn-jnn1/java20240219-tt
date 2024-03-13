package ch16.Example.exam08;

public class Example {
    private static Student[] students = {
            new Student("홍길동", 90, 96),
            new Student("신용권", 95, 93)
    };

    public static double avg(Function<Student> function) {
        double sum = 0.0;
        for (Student student : students) {
            sum += function.apply(student);
        }
        return sum / students.length;
    }

    ;

    public static void main(String[] args) {
        double englishAvg = avg(s -> s.getEnglishScore());
        System.out.println("영어 평균 점수: " + englishAvg);

        double mathAvg = avg(s -> s.getMathScore());
        System.out.println("수학 평균 점수: " + mathAvg);
    }
}


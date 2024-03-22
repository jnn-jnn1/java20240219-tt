package ch17.sec11;

import java.util.*;

public class ReductionExample {
    public static void main(String[] args) {
        List<Student> studentList = Arrays.asList(
                new Student("홍길동", 92),
                new Student("신용권", 95),
                new Student("김자바", 88)
        );

        int sum = studentList.stream()
                .mapToInt(Student::getScore)
                .sum();

        int reduce = studentList.stream()
                .mapToInt(Student::getScore)
                .reduce(0, (a, b) -> a + b);

        
        System.out.println("sum = " + sum);
        System.out.println("reduce = " + reduce);
    }
}

package ch16.sec03;

public class PersonExample {
    public static void main(String[] args) {
        Person person = new Person();

        person.action1((name, job) -> {
            System.out.println(STR."\{name}이 \{job}을 합니다");
        });

        person.action1((name, job) -> System.out.println(STR."\{name}이 \{job}을 하지 않습니다"));

        person.action2(content -> System.out.println(STR."\{content}라고 말합니다"));
        person.action2(content -> System.out.println(STR."\{content}라고 외칩니다"));
    }
}

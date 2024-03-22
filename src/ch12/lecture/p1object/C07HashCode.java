package ch12.lecture.p1object;

import java.util.Objects;

public class C07HashCode {
    public static void main(String[] args) {
        C07MyClass o1 = new C07MyClass("이것이 자바다");
        C07MyClass o2 = new C07MyClass("이것이 자바다");
        C07MyClass o3 = new C07MyClass("스프링 부트");

        System.out.println(o1 == o2); // false : 참조값 다름
        int i1 = o1.hashCode();
        int i2 = o2.hashCode();
        int i3 = o3.hashCode();

        System.out.println(o1 == o2); // true
        System.out.println(o1 == o3); // false

    }
}

class C07MyClass {

    private String title;

    public C07MyClass(String title) {
        this.title = title;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        C07MyClass that = (C07MyClass) o;

        return Objects.equals(title, that.title);
    }

    @Override
    public int hashCode() {
        return title != null ? title.hashCode() : 0;
    }

    // hashCode
    // 1. 같은 객체가 hashCode를 여러 번 호출해도
    // 같은 값이 나와야 함
    // 2. 두 객체가 equals로 같은 객체로 여겨지면
    // 두 객체의 haseCode는 같아야 함
    // 3. 두 객체가 equals로 같지 않더라도
    // 두 객체의 hashCode는 같을 수도 있음

}

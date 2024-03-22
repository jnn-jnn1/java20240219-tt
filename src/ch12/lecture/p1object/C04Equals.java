package ch12.lecture.p1object;

import org.w3c.dom.ls.LSOutput;

public class C04Equals {
    public static void main(String[] args) {
        C04Book book1 = new C04Book("스프링 부트3");
        C04Book book2 = new C04Book("이것이 자바다");
        C04Book book3 = book2;
        C04Book book4 = new C04Book("이것이 자바다");
        System.out.println(book4.equals(book1)); // false
        System.out.println(book4.equals(book2)); // false -> true
        System.out.println(book3.equals(book2)); // true
    }

}

class C04Book {
    private String title;

    public C04Book(String title) {
        this.title = title;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof C04Book other) {
            return this.title.equals(other.title);
        }
        return false;
    }
}
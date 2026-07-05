package Library;

import Library.Book;
import Library.Member;

public class TestLibrary {

    public static void main(String[] args) {

        Book b1 = new Book("The Alchemist");
        Book b2 = new Book("Kite Runner");

        Member m1 = new Member("George");
        Member m2 = new Member("Martha");

        System.out.println("===== Initial Status =====");
        b1.status();
        b2.status();
        m1.status();
        m2.status();

        System.out.println("\n===== Issue Book =====");
        b1.issueBook(m1);

        System.out.println("\n===== After Issue =====");
        b1.status();
        m1.status();

        System.out.println("\n===== Try issuing same book again =====");
        b1.issueBook(m2); // should show error

        System.out.println("\n===== Return Book =====");
        b1.returnBook();

        System.out.println("\n===== Final Status =====");
        b1.status();
        m1.status();
    }
}
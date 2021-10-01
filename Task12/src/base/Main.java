package base;

import base.task12.AuthorComparator;
import base.task12.Book;
import base.task12.TitleComparator;
import base.task13.ProgrammerBook;

import java.util.Comparator;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        Book book1 = new Book("Alice in wonderland", "Lewis Carroll", 100, 1, 1);
        Book book2 = new Book("It", "Stephen King", 200, 2, 2);

        System.out.println(book1.equals(book2));
        System.out.println(book1.hashCode());
        System.out.println(book1.toString());
        System.out.println();

        ProgrammerBook programmerBook = new ProgrammerBook("C# for beginners", "msdn", 150, 1, 1, "English", 0);

        System.out.println(programmerBook.equals(programmerBook));
        System.out.println(programmerBook.hashCode());
        System.out.println(programmerBook.toString());
        System.out.println();

        //task15 example
        Comparator<Book> booksCompare = new TitleComparator().thenComparing(new AuthorComparator());
        TreeSet<Book> books = new TreeSet<Book>(booksCompare);

        books.add(book1);
        books.add(book2);
        books.add(new Book("It", "Lion King", 200, 3, 3));

        for(Book  book : books) {
            System.out.println(book.toString());
        }
    }
}

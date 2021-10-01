package base.task12;

import java.math.BigInteger;
import java.util.Base64;
import java.util.Comparator;

public class Book implements Comparable<Book>, Comparator<Book> {
    protected String title;
    protected String author;
    protected int price;
    protected static int edition;
    protected int isbn;

    public Book(String title, String author, int price, int edition, int isbn) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.isbn = isbn;
    }

    @Override
    public boolean equals(Object obj)
    {
        if(obj == this) {
            return true;
        }

        if(obj == null) {
            return false;
        }

        if(this.getClass() != obj.getClass()) {
            return false;
        }
        else {
            Book book = (Book)obj;
            return (this.title == book.title &&
                    this.author == book.author &&
                    this.price == book.price);
        }
    }

    @Override
    public int hashCode() {
        byte[] title = Base64.getEncoder().encode(this.title.getBytes());
        byte[] author = Base64.getEncoder().encode(this.author.getBytes());

        for(int i = 0; i < Math.min(title.length, author.length); i++) {
            title[i] ^= author[i];
        }

        return (new BigInteger(1, title).intValue() + this.price);
    }

    @Override
    public String toString() {
        return ("Title: " + this.title + ", author: " + this.author + ", price: " + this.price);
    }

    @Override
    public Book clone() {
        return (new Book(title, author, price, edition, isbn));
    }

    @Override
    public int compareTo(Book book) {
        if (this.isbn < book.isbn) {
            return -1;
        } else if (this.isbn == book.isbn) {
            return 0;
        } else {
            return 1;
        }
    }

    public int compare(Book book1, Book book2) {
        return (book1.title.compareToIgnoreCase(book2.title));
    }


}

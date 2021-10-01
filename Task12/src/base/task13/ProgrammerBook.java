package base.task13;

import base.task12.Book;
import java.math.BigInteger;
import java.util.Base64;

public class ProgrammerBook extends Book {
    private String language;
    private int level;

    public ProgrammerBook(String title, String author, int price, int edition, int isbn, String language, int level) {
        super(title, author, price, edition, isbn);
        this.language = language;
        this.level = level;
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
            ProgrammerBook book = (ProgrammerBook) obj;
            return (this.title == book.title &&
                    this.author == book.author &&
                    this.price == book.price);
        }
    }

    @Override
    public int hashCode() {
        byte[] title = Base64.getEncoder().encode(this.title.getBytes());
        byte[] author = Base64.getEncoder().encode(this.author.getBytes());
        byte[] language = Base64.getEncoder().encode(this.language.getBytes());

        for(int i = 0; i < Math.min(language.length, Math.min(title.length, author.length)); i++) {
            title[i] ^= author[i] ^ language[i];
        }

        return (new BigInteger(1, title).intValue() + this.price + this.level);
    }

    @Override
    public String toString() {
        return ("Title: " + this.title + ", author: " + this.author + ", price: " + this.price +
                ", language: " + this.language + ", level: " + this.level);
    }

}

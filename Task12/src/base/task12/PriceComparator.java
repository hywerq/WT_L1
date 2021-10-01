package base.task12;

import java.util.Comparator;

public class PriceComparator implements Comparator<Book> {

    @Override
    public int compare(Book book1, Book book2) {
        return (Integer.compare(book1.price, book2.price));
    }
}

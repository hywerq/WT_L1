package base.task12;

import java.util.Comparator;

public class TitleComparator implements Comparator<Book> {

    @Override
    public int compare(Book book1, Book book2) {
        return (book1.title.compareToIgnoreCase(book2.title));
    }
}

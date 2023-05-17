package Advanced.IteratorsAndComparators.Lab.p2_Library;

import java.util.Iterator;

public class Library<Book> implements Iterable<Book> {

    private Book[] books;

    public Library(Book... books) {
        this.books = books;
    }

    @Override
    public Iterator<Book> iterator() {
        return new LibraryIterator();
    }

    public Book[] getBooks() {
        return books;
    }

    public Library<Book> setBooks(Book... books) {
        this.books = books;
        return this;
    }

    private final class LibraryIterator implements Iterator<Book> {

        private int counter = 0;

        @Override
        public boolean hasNext() {
            if (this.counter < books.length) {
                return true;
            }
            return false;
        }

        @Override
        public Book next() {
            return books[counter++];
        }
    }
}

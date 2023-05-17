package Advanced.IteratorsAndComparators.Lab.p3_ComparableBook;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Book implements Comparable<Book>{

    private String title;
    private int year;
    private List<String> authors;

    public Book(String title, int year, String... authors){
        this.setTitle(title);
        this.setYear(year);
        this.setAuthors(authors);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public List<String> getAuthors() {
        return authors;
    }

    private void setAuthors(String... authors) {
        if (authors.length == 0) {
            this.authors = new ArrayList<String>();
        } else {
            this.authors = new ArrayList<>(Arrays.asList(authors));
        }
    }

    @Override
    public int compareTo(Book other) {
        if (this.getTitle().compareTo(other.getTitle()) == 0) {
            if (this.getYear() > other.getYear()) {
                return 1;
            } else if (this.getYear() < other.getYear()) {
                return -1;
            }
            return 0;
        } else {
            return this.getTitle().compareTo(other.getTitle());
        }
    }
}

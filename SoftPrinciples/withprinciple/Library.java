package InformationExpert.withprinciple;

import java.util.ArrayList;
import java.util.List;

class Library {
    private List<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public boolean isBookAvailable(String title) {
        for (Book book : books) {
            if (book.isAvailable(title)) {
                return true;
            }
        }
        return false;
    }
}

class Book {
    private String title;
    private boolean borrowed;

    public Book(String title) {
        this.title = title;
        this.borrowed = false;
    }

    public boolean isAvailable(String searchTitle) {
        return this.title.equals(searchTitle) && !borrowed;
    }

    public void borrowBook() {
        borrowed = true;
    }
}

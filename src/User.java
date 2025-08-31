import java.util.ArrayList;
public class User {
    private String name;
    private ArrayList<Book> issuedBooks;

    public User(String name) {
        this.name = name;
        this.issuedBooks = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Book> getIssuedBooks() {
        return issuedBooks;
    }

    public void issueBook(Book book) {
        if (!book.isIssued()) {
            book.issueBook(this);
            issuedBooks.add(book);
        }
    }

    public void returnBook(Book book) {
        if (issuedBooks.contains(book)) {
            book.returnBook();
            issuedBooks.remove(book);
        }
    }
}


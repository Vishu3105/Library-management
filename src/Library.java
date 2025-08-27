import java.util.ArrayList;

class Library {
    private ArrayList<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
        System.out.println(book.getTitle() + " added to the library.");
    }

    public void showAvailableBooks() {
        System.out.println("\nAvailable Books:");
        for (Book book : books) {
            if (!book.isIssued()) {
                System.out.println(book);
            }
        }
    }

    public void issueBook(String title, User user) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title) && !book.isIssued()) {
                book.issueBook();
                user.issueBook(book);
                System.out.println(user.getName() + " issued " + book.getTitle());
                return;
            }
        }
        System.out.println("Book not available.");
    }

    public void returnBook(String title, User user) {
        for (Book book : user.getIssuedBooks()) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                book.returnBook();
                user.returnBook(book);
                System.out.println(user.getName() + " returned " + book.getTitle());
                return;
            }
        }
        System.out.println("This book was not issued by " + user.getName());
    }
}


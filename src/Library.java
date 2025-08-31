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
        boolean found = false;
        for (Book book : books) {
            if (!book.isIssued()) {
                System.out.println(book);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No books available.");
        }
    }

    public void issueBook(String title, User user) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title) && !book.isIssued()) {
                user.issueBook(book);
                System.out.println(book.getTitle() + " issued to " + user.getName());
                return;
            }
        }
        System.out.println("Book not available.");
    }

    public void returnBook(String title, User user) {
        for (Book book : user.getIssuedBooks()) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                user.returnBook(book);
                System.out.println(user.getName() + " returned " + book.getTitle());
                return;
            }
        }
        System.out.println("This book was not issued to " + user.getName());
    }

    public void showIssuedBooks() {
        System.out.println("\nIssued Books:");
        boolean found = false;
        for (Book book : books) {
            if (book.isIssued()) {
                System.out.println(book.getTitle() + " issued to " + book.getIssuedTo().getName());
                found = true;
            }
        }
        if (!found) {
            System.out.println("No books are currently issued.");
        }
    }
}


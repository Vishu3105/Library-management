import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Library library = new Library();
        HashMap<String, User> users = new HashMap<>(); // multi users

        while (true) {
            System.out.println("\n--- Library Menu ---");
            System.out.println("1. Add Book");
            System.out.println("2. Show Available Books");
            System.out.println("3. Issue Book");
            System.out.println("4. Return Book");
            System.out.println("5. Show All Issued Books");
            System.out.println("6. Exit");
            System.out.print("Choose option: ");

            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter book title: ");
                    String title = sc.nextLine();
                    System.out.print("Enter author: ");
                    String author = sc.nextLine();
                    library.addBook(new Book(title, author));
                    break;

                case 2:
                    library.showAvailableBooks();
                    break;

                case 3:
                    System.out.print("Enter student name: ");
                    String issueUserName = sc.nextLine();
                    users.putIfAbsent(issueUserName, new User(issueUserName));
                    User issueUser = users.get(issueUserName);
                    System.out.print("Enter book title to issue: ");
                    String issueTitle = sc.nextLine();
                    library.issueBook(issueTitle, issueUser);
                    break;

                case 4:
                    System.out.print("Enter student name: ");
                    String returnUserName = sc.nextLine();
                    if (!users.containsKey(returnUserName)) {
                        System.out.println("No such student.");
                        break;
                    }
                    User returnUser = users.get(returnUserName);
                    System.out.print("Enter book title to return: ");
                    String returnTitle = sc.nextLine();
                    library.returnBook(returnTitle, returnUser);
                    break;

                case 5:
                    library.showIssuedBooks();
                    break;

                case 6:
                    System.out.println("Exiting...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}

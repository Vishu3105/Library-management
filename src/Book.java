class Book {
    private String title;
    private String author;
    private boolean isIssued;
    private User issuedTo;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.isIssued = false;
        this.issuedTo = null;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isIssued() {
        return isIssued;
    }

    public User getIssuedTo() {
        return issuedTo;
    }

    public void issueBook(User user) {
        isIssued = true;
        issuedTo = user;
    }

    public void returnBook() {
        isIssued = false;
        issuedTo = null;
    }

    @Override
    public String toString() {
        if (isIssued) {
            return title + " by " + author + " [Issued to: " + issuedTo.getName() + "]";
        } else {
            return title + " by " + author + " [Available]";
        }
    }
}


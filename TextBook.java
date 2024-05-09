public class TextBook extends Book {
    private String subject;
    
    public TextBook(String title, String author, int year, String subject) {
        super(title, author, year);
        this.subject = subject;
        //TODO Auto-generated constructor stub
    }

    @Override
    public void borrowBook() {
        System.out.println("Textbook : " + getTitle() + " borrowed successfully.");
        super.borrowBook();
    }

    @Override
    public void returnBook() {
        if (!isBorrowed()) {
            System.out.println("Textbook : " + getTitle() + " is not borrowed.");
            return;
        }
        System.out.println("Textbook : " + getTitle() + " returned successfully.");
        super.returnBook();
    }
}

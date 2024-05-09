public class Magazine extends Book {
    private String category;

    public Magazine(String title, String author, int year, String category) {
        super(title, author, year);
        this.category = category;
        //TODO Auto-generated constructor stub
    }
    
    @Override
    public void borrowBook() {
        System.out.println("Magazine : " + getTitle() + " borrowed successfully.");
        super.borrowBook();
    }

    @Override
    public void returnBook() {
        if (!isBorrowed()) {
            System.out.println("Magazine : " + getTitle() + " is not borrowed.");
            return;
        }
        System.out.println("Magazine : " + getTitle() + " returned successfully.");
        super.returnBook();
    }
}

public class Novel extends Book{ 
    private String genre;
    
    public Novel(String title, String author, int year, String genre) {
        super(title, author, year);
        this.genre = genre;
        //TODO Auto-generated constructor stub
    }
    
    @Override
    public void borrowBook() {
        System.out.println("Novel : " + getTitle() + " borrowed successfully.");
        super.borrowBook();
    }

    @Override
    public void returnBook() {
        if (!isBorrowed()) {
            System.out.println("Novel : " + getTitle() + " is not borrowed.");
            return;
        }
        System.out.println("Novel : " + getTitle() + " returned successfully.");
        super.returnBook();
    }
}

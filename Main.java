import java.util.ArrayList;

public class Main {
    public static ArrayList<Book> buku = new ArrayList<>();
    public static void main(String[] args) {
        System.out.println("---- Book Informations ----");
        loadBook();
        for (Book childBook : buku) {
            childBook.display();
            System.out.println();
        }

        System.out.println("---- Borrowing and Returning Books ----");
        buku.get(0).borrowBook();
        buku.get(2).borrowBook();
        buku.get(0).returnBook();
        buku.get(1).returnBook();
    }

    public static void loadBook() {
        buku.add(new TextBook("Java Programming", "John Smith", 2020, "Programming"));
        buku.add(new Novel("To Kill a Mockingbird", "Harper Lee", 1960, "Fantasy"));
        buku.add(new Magazine("National Geographic", "Various", 2021, "Science"));
    }
}

import java.util.ArrayList;

public class Borrower {

    private String name;
    private ArrayList<Book> booksInPossession;

    public Borrower(String name){
        this.name = name;
        this.booksInPossession = new ArrayList<>();
    }

    public String getName(){
        return this.name;
    }

    public int booksInPossessionCount(){
        return this.booksInPossession.size();
    }

    public void borrowBook(Library library, Book book){
        if (library.checkBookIsInStock(book)){
            Book bookBorrowed = library.removeBook(book);
            this.booksInPossession.add(bookBorrowed);
        }
    }
}

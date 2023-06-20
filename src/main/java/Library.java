import java.util.ArrayList;
import java.util.HashMap;

public class Library {

    private String name;

    private ArrayList<Book> books;
    private int stockCapacity;

    public Library(String name, ArrayList<Book> books){
        this.name = name;
        this.books = books;
        this.stockCapacity = 5;
    }

    public String getName(){
        return this.name;
    }

    public int bookCount(){
        return this.books.size();
    }

    public boolean checkIfStockIsFull(){
        if (this.books.size() < this.stockCapacity){
            return false;
        } else {
            return true;
        }
    }

    public void addBook(Book bookToAdd){
        if (!this.checkIfStockIsFull()){
            this.books.add(bookToAdd);
        }
    }

    public boolean checkBookIsInStock(Book book){
        if (this.books.contains(book)){
            return true;
        } else {
            return false;
        }
    }

    public Book removeBook(Book book){
        return this.books.remove(this.books.indexOf(book));
    }

    public int getNumberOfBooksByGenre(String genre){
        HashMap <String, Integer> numberOfBooksByGenre = new HashMap<>();
        for (Book book:this.books){
            if (!numberOfBooksByGenre.containsKey(book.getGenre())){
                numberOfBooksByGenre.put(book.getGenre(), 1);
            } else {
                int currentValue = numberOfBooksByGenre.get(book.getGenre());
                numberOfBooksByGenre.put(book.getGenre(), (currentValue+1));
            }
        }
        return numberOfBooksByGenre.get(genre);

    }
}

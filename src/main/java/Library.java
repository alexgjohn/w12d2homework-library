import java.util.ArrayList;

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
}

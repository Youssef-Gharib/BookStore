/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookstore;
import java.util.*; 
/**
 *
 * @author hp
 */
public class Inventory {
    private List<Book> books = new ArrayList<>(); 
    
    public void addBook(Book b){
        books.add(b); 
        System.out.println("book added");
    }
    
    public List<Book> removeOutdatedBooks(int acceptableYears){
        List<Book> outdatedBooks =new ArrayList<>(); 
        int currentYear = 2025;
        Iterator<Book> iterator = books.iterator();
        while (iterator.hasNext()) {
            Book b = iterator.next();
            if (b.isOutDated(currentYear, acceptableYears)) {
                outdatedBooks.add(b);
                iterator.remove();
                System.out.println("Removed outdated books " + b);
            }
        }
        return outdatedBooks;
    }
    
    public double buyBook(String isbn, int quantity, String email, String address) throws Exception {
        for (Book book : books) {
            if (book.getISPN().equals(isbn)) {
                return book.buy(isbn,quantity, email, address);
            }
        }
        throw new Exception("Book not found.");
    }
}


package bookstore;
public class Ebook extends Book {
    private String fileType; 
    
    
    
    public Ebook(String isbn, String title, int year, double price, String fileType){
        super(isbn, title, year, price ); 
        this.fileType= fileType; 
    }
    
    
    
    @Override
    public double buy(String ispn, int q, String email, String add){
        System.out.println("book send on email:" +email);
        
        return q* price; 
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookstore;

/**
 *
 * @author hp
 */
public class BookStoreTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Inventory inventory = new Inventory();

        
        inventory.addBook(new PaperBook("P1", "Java Programming", 2015, 120.0, 10));
        inventory.addBook(new Ebook("P2", "Machine Learning", 2020, 90.0, "PDF"));
        inventory.addBook(new BookDemo("P3", "Design Patterns", 2010, 0.0));

        // Remove outdated books
        inventory.removeOutdatedBooks(6);

        // Buying books
        try {
            double amount1 = inventory.buyBook("P1", 2, "yousifgharib44@mail.com", "123 M");
            System.out.println("Amount paid: " + amount1);

            double amount2 = inventory.buyBook("P2", 1, "ebook@mail.com", "");
            System.out.println(" Amount paid: " + amount2);

          
            inventory.buyBook("P3", 1, "test@mail.com", "");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookstore;
public class PaperBook extends Book {
    private int numberOfbooks;
   public PaperBook(String isbn, String title, int year, double price, int n) {
        super(isbn, title, year, price);
        this.numberOfbooks = numberOfbooks;
    }


    @Override
    public double buy(String ispn, int quantity, String email, String address) throws Exception {
        if (quantity > numberOfbooks)
            throw new Exception("Not enough books.");
        numberOfbooks -= quantity;
        
        
        System.out.println(" Shipping paper book to " + address);
        return quantity * price;
    }
  
}

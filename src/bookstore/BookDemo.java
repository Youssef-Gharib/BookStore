/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookstore;


public class BookDemo extends Book {
    public BookDemo(String isbn, String title, int year, double price){
       super(isbn, title, year, price );  
    }
    
    
    
    
    @Override 
    public double buy(String ispn, int q, String email, String add)throws Exception{
        throw new Exception ("this book just showcasebook and not for sale") ; 
    }
    
}


package bookstore;
public abstract class  Book {
    private
            String ISPN; 
            String title; 
            double price; 
            int year;  
            
    public Book(String isbn, String title, int year, double price) {
        this.ISPN = isbn;
        this.title = title;
        this.year = year;
        this.price = price;
    }     
            
    public String getISPN(){
        return ISPN; 
    }
    public void setISPN(String ISPN){
        this.ISPN = ISPN ; 
    }
    
    
             
    public int getYear(){
        return year; 
    }
    public void setYear(int y){
        year = y ; 
    }
    
    
             
    public double getPrice(){
        return price; 
    }
    public void setPrice(double p){
        price = p ; 
    }


    public boolean isOutDated(int current, int acceptableYears ){
        if((current-year)> acceptableYears)
            return true; 
        else return false; 
    
    }
    
    public abstract double buy(String ISPN, int quantity,String email, String address)throws Exception ; 
    
}

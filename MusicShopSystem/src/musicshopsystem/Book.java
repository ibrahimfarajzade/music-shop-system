/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package musicshopsystem;

/**
 *
 * @author comteibra
 */
public class Book extends Product{
    private String author;
    private int edition;
    public static int totalBooks = 0;

    public Book() {
        
    }

    public Book(String author, int edition, int id, String name, String manufacturer) {
        super(id, name, manufacturer);
        this.author = author;
        this.edition = edition;
        totalBooks++;
    }

    public static int getTotalBooks() {
        return totalBooks;
    }

    @Override
    public double calculatePrice() {
        double price = 0;
        
        if (manufacturer.equalsIgnoreCase("Pearson"))
            return price = 3.49;
        else if (manufacturer.equalsIgnoreCase("Abacus"))
            return price = 4.79;
        else if (manufacturer.equalsIgnoreCase("Pentagon Press"))
            return price = 5.29;
        
        return price;
    }

    @Override
    public double addTax() {
        double taxPrice;
        
        taxPrice =  calculatePrice() * 0.08;
        
        return taxPrice +  calculatePrice();
    }
    
     @Override
    public String toString() {
        return super.toString() + "\nAuthor: " + author + "\nEdition: " + edition;
    }
}

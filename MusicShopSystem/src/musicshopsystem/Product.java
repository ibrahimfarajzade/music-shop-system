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
public abstract class Product implements ProductInterface{
    protected int id;
    protected String name;
    protected String manufacturer;

    public Product() {
        
    }

    public Product(int id, String title, String publisher) {
        this.id = id;
        this.name = title;
        this.manufacturer = publisher;
    }

    public int getId() {
        return id;
    }
    
    public abstract double calculatePrice();
    
    @Override
    public String toString() {
        return "\nId: " + id + "\nTitle: " + name + "\nPublisher: " + manufacturer;
    }
}

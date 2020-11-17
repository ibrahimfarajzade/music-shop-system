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
public class MusicCDs extends Product{
    private String artist;
    private String mrc;
    public static int totalCDs = 0;

    public MusicCDs() {
        
    }

    public MusicCDs(String artist, String mrc, int id, String name, String manufacturer) {
        super(id, name, manufacturer);
        this.artist = artist;
        this.mrc = mrc;
    }

    public static int getTotalCDs() {
        return totalCDs;
    }

    @Override
    public double calculatePrice() {
        double price = 0;
        
        if (mrc.equalsIgnoreCase("gold"))
            price = 11.97;
        else if (mrc.equalsIgnoreCase("platinum"))
            price = 14.97;
        else if (mrc.equalsIgnoreCase("diamond"))
            price = 19.97;
        
        return price;
    }

    @Override
    public double addTax() {
        double taxPrice;
        
        taxPrice =  calculatePrice() * 0.1;
        
        return taxPrice +  calculatePrice();
    }
    
    @Override
    public String toString() {
        return super.toString() + "\nArtist: " + artist;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package musicshopsystem;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author comteibra
 */
public class ProductSystem {
    public static ArrayList<Product> products = new ArrayList<>();
    
    
    public static boolean addProduct(Product p) {
        for (Product i : products)
            if (i.getId() == p.getId())
                return false;
        
        products.add(p);
        return true;    
    }
    
    public static double displayPrice() {
        double price = 0;
        
        for (Product i : products) 
            price = i.calculatePrice();
        
        return price;
    }
    
    public static double displayPricewithTax() {
        double price = 0;
        
        for (Product i : products) 
            price = i.addTax();
        
        return price;
    }
    
    public static Product searchProduct(int id) {
        for (Product i : products)
            if (i.getId() == id)
                return i;
        
        return null;
    }
    
    public static boolean deleteProduct(int id) {
        for (Product i : products)
            if (i.getId() == id) {
                products.remove(i);
                return true;
            }
        return false;
    }
    
    public static Set<Product> displayAll() {
        Set<Product> set = new LinkedHashSet<Product>(products);
        
        return set;
    }
    
    public static boolean checkProduct(int id) {
        for (Product i : products)
            if (i.getId() == id)
                return true;
        
        return false;
    }
    
    public static String readTxt() {
        File file1 = new File("music.txt");
        File file2 = new File("book.txt");
        File file3 = new File("device.txt");
        
        try {
            Scanner sc = new Scanner(file1);
            
            while (sc.hasNext()) {
                String[] split = sc.nextLine().split(":");
                
                String id = split[0];
                String name = split[1];
                String manufacturer = split[2];
                String artist = split[3];
                String mrc = split[4];
                
                MusicCDs mcds = new MusicCDs(artist, mrc, Integer.parseInt(id), name, manufacturer);
                products.add(mcds);
            }
            
            sc = new Scanner(file2);
            
            while (sc.hasNext()) {
                String[] split = sc.nextLine().split(":");
                
                String id = split[0];
                String name = split[1];
                String manufacturer = split[2];
                String author = split[3];
                String edition = split[4];
                
                Book book = new Book(author, Integer.parseInt(edition), Integer.parseInt(id), name, manufacturer);
                products.add(book);
            }
            
            sc = new Scanner(file3);
            
            while (sc.hasNext()) {
                String[] split = sc.nextLine().split(":");
                
                String id = split[0];
                String name = split[1];
                String manufacturer = split[2];
                String color = split[3];
                String connection = split[4];
                String dtype = split[5];
                
                Device device = new Device(dtype, Integer.parseInt(id), name, manufacturer);
                TechSpec ts = new TechSpec(color, connection);
                device.addTechSpec(ts);
                products.add(device);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ProductSystem.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "read";
    }
}

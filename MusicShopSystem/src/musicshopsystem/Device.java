/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package musicshopsystem;

import java.util.ArrayList;

/**
 *
 * @author comteibra
 */
public class Device extends Product{
    private String type;
    private ArrayList<TechSpec> techspec = new ArrayList();

    public Device() {
        
    }

    public Device(String type, int id, String name, String manufacturer) {
        super(id, name, manufacturer);
        this.type = type;
    }
    
    
    public void addTechSpec(TechSpec ts) {
        techspec.add(ts);
    }

    @Override
    public double calculatePrice() {
        double price = 0;
        
        if (type.equalsIgnoreCase("Headphone")) {
            if (name.equalsIgnoreCase("AirPods"))
                price = 159;
            else if (name.equalsIgnoreCase("PowerBeats Pro"))
                price = 249;
            else if (name.equalsIgnoreCase("QC 35"))
                price = 349;
        } else if (type.equalsIgnoreCase("Speaker")) {
            if (name.equalsIgnoreCase("HomePod"))
                price = 349;
            else if (name.equalsIgnoreCase("Aura Studio"))
                price = 229;
            else if (name.equalsIgnoreCase("Zeppelin"))
                price = 599;
        }
        
        return price;
    }

    @Override
    public double addTax() {
        double taxPrice;
        
        taxPrice =  calculatePrice() * 0.18;
        
        return taxPrice +  calculatePrice();
    }

    @Override
    public String toString() {
        return super.toString() + "\nType: " + type + "\nTechspec=" + techspec;
    }
    
    
    
    
}

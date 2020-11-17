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
public class TechSpec {
    private String color;
    private String connection;

    public TechSpec() {
        
    }

    public TechSpec(String connection, String color) {
        this.connection = connection;
        this.color = color;
    }
    
    @Override
    public String toString() {
        return "\nColor: " + color + "\nConnection: " + connection;
    }
}

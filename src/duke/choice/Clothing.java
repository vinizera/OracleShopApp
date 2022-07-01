/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duke.choice;

/**
 *
 * @author Vinicius
 */
public class Clothing {
    
    // field variables
    private String description;
    private String size = "M";
    private double price = 10.0;
    
    public final static double MIN_PRICE = 10.0;
    public final static double TAX_RATE = .2;

    // constructors
    public void Clothing(String description, String size, double price) {
        this.description = description;
        this.size = size;
        this.price = price;
    }

    // getters and setters
    public void setDescription(String newDesc)  {
        this.description = newDesc;
    }
    
    public String getDescription() {
        return this.description;
    }
    
    public void setSize(String newSize) {
        this.size = newSize.toUpperCase();
    }
    
    public String getSize() {
        return this.size;
    }
    
    public void setPrice(double newPrice) {
        this.price = (newPrice > MIN_PRICE) ? newPrice : MIN_PRICE; 
    }
        
    public double getPrice() {
        return this.price * (this.TAX_RATE + 1);
    }
    
}

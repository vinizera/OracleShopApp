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

public class Customer {
    
    // variable fields
    private String name;
    private String size;
    
    private Clothing[] items;

    // constructors
    public Customer(String name, String size) {
        this.name = name;
        this.size = size;
    }
    
    public Customer(String name, int aMeasurement) {
        this.name = name;
        setSize(aMeasurement);
    }
    
    public void addItems(Clothing[] someItems) {
        this.items = someItems;
    }
    
    public Clothing[] getItems() {
        return this.items;
    }
    
    public double getTotalClothingCost() {
        double total = 0.0;
        for (Clothing item: items) {
            System.out.print( "> " + item.getDescription());
            System.out.printf(": $%5.2f", item.getPrice());
            System.out.println();
            total += item.getPrice();
        }
        return total;
    }
    
    public void setName(String newName) {
        this.name = newName;
    }
    
    public String getName() {
        return this.name;
    }
    
    public void setSize(int measurement) {
            
        switch (measurement) {
            case 1: case 2: case 3:
                this.size = "S";
                break;
            case 4: case 5:case 6:
                this.size =  "M";
                break;
            case 7: case 8: case 9:
                this.size = "L";
                break;
            default:
                this.size =  "X";
        }
    }
    
    public void setSize(String newSize) {
        this.size = newSize;
    }
    
    public String getSize() {
        return this.size;
    }
    
}

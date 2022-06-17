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
public class ShopApp {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Declaring customers
        Customer c1 = new Customer("Pinky", 3);     
        
        System.out.println("Welcome to Duke Choice Shop!");
        System.out.println("CUSTOMER: " + c1.getName() + ", Size: " + c1.getSize());
        System.out.println("Minumum price: " + Clothing.MIN_PRICE);
        
        
        // Declaring items
        Clothing item1 = new Clothing();
        item1.setDescription("RVCA Francis Horton T-shirt");
        item1.setPrice(20.9);
        
        Clothing item2 = new Clothing();
        item2.setDescription("H&M Basic black T-shirt");
        item2.setSize("M");
        item2.setPrice(10.5);
        
        // Checkout and total        
      
        
        Clothing item3 = new Clothing();
        item3.setDescription("Rothaus Radler T-shirt");
        
        Clothing item4 = new Clothing();
        item4.setDescription("Green Scarf");
        item4.setPrice(5.0);
        item4.setSize("S");
        
        Clothing item5 = new Clothing();
        item5.setDescription("Blue T-Shirt");
        item5.setPrice(10.5);
        item5.setSize("S");
        
        Clothing[] itemsMain = {item1, item3, item4};
        
        c1.addItems(itemsMain);
        
        System.out.printf("TOTAL: $%5.2f", c1.getTotalClothingCost());
        System.out.println();
        
        
        
    }
    
}

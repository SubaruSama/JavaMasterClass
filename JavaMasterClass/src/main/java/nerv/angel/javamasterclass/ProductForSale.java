/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nerv.angel.javamasterclass;

/**
 *
 * @author Andres
 */
public abstract class ProductForSale {
    
    protected String type;
    protected double price;
    protected String description;

    public ProductForSale(String type, double price, String description) {
        this.type = type;
        this.price = price;
        this.description = description;
    }
    
    public abstract void showDetails();
    
    public double getSalesPrice(int quantity) {
        return quantity * this.price;
    }
    
    public void printPricedItem(int quantity) {
        System.out.printf("Quantity of products: %d | Price: %f%n", quantity, getSalesPrice(quantity));
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nerv.angel.javamasterclass;

/**
 *
 * @author Andres
 */
public class Cup extends ProductForSale {

    public Cup(String type, double price, String description) {
        super(type, price, description);
    }

    @Override
    public void showDetails() {
        System.out.println("Made to hold your coffee, and helps to drink your coffee.");
        System.out.printf("Price >>> $%6.2f %n", price);
        System.out.println(description);
    }
    
}

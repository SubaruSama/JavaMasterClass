/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nerv.angel.javamasterclass;

/**
 *
 * @author Andres
 */
public class CreamForCoffee extends ProductForSale {

    public CreamForCoffee(String type, double price, String description) {
        super(type, price, description);
    }

    @Override
    public void showDetails() {
        System.out.println("If you like your coffee with some sweet, try these.");
        System.out.printf("Price >>> $%6.2f %n", price);
        System.out.println(description);
    }
    
}

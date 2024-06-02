/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nerv.angel.javamasterclass;

/**
 *
 * @author Andres
 */
public class CoffeeBeans extends ProductForSale {

    public CoffeeBeans(String type, double price, String description) {
        super(type, price, description);
    }

    @Override
    public void showDetails() {
        System.out.println("Best coffee beans around the town! Give some try!");
        System.out.printf("Price >>> $%6.2f %n", price);
        System.out.println(description);
    }
    
}

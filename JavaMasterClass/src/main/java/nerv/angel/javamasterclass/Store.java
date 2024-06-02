/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nerv.angel.javamasterclass;

import java.util.ArrayList;

/**
 *
 * @author Andres
 */
public class Store {
    
    private static ArrayList<ProductForSale> products = new ArrayList<>();
    
    public static void main(String[] args) {
        
        /**
         * Manage a list of products for sale, including displaying the product details
         * Manage and order, which can be just be a list of OrderItem objects
         * Have methods to add an item to the order, and print the ordered items, so it looks like a sales receipt
         */
        products.add(new CoffeeBeans("beverage", 5.75, "delicious"));
        products.add(new CreamForCoffee("topping", 3, "very sugary"));
        products.add(new Cup("utensil", 2, "it holds your coffee or tea (and don't burn your hand)"));
        
        listProducts();
        
        System.out.println();
        
        System.out.println("Order 1");
        ArrayList<OrderItem> order1 = new ArrayList<>();
        addItemToOrder(order1, 0, 10);
        addItemToOrder(order1, 1, 5);
        addItemToOrder(order1, 2, 10);
        printOrder(order1);
        
        System.out.println("-".repeat(30));
        
        System.out.println("Order 2");
        ArrayList<OrderItem> order2 = new ArrayList<>();
        addItemToOrder(order2, 0, 0);
        addItemToOrder(order2, 1, 10);
        addItemToOrder(order2, 2, 10);
        printOrder(order2);
    }
    
    public static void addItemToOrder(ArrayList<OrderItem> order, int orderIndex, int quantity) {
        order.add(new OrderItem(quantity, products.get(orderIndex)));
    }
    
    public static void printOrder(ArrayList<OrderItem> order) {
        
        double salesTotal = 0;
        
        for (OrderItem item : order) {
            item.product().printPricedItem(item.quantity());
            salesTotal += item.product().getSalesPrice(item.quantity());
        }
        
        System.out.printf("Sales total = %6.2f %n", salesTotal);
    }
    
    public static void listProducts() {
        
        for (ProductForSale item : products) {
            System.out.println("-".repeat(30));
            item.showDetails();
        }
    }
}

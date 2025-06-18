package InventoryManagementSystem;

import java.util.HashMap;

public class InventoryManager {
    private HashMap<Integer, Product> inventory = new HashMap<>();

    // Add product
    public void addProduct(Product product) {
        inventory.put(product.getProductId(), product);
        System.out.println("Product added: " + product);
    }

    // Update product
    public void updateProduct(int productId, String name, int quantity, double price) {
        Product p = inventory.get(productId);
        if (p != null) {
            p.setProductName(name);
            p.setQuantity(quantity);
            p.setPrice(price);
            System.out.println("Product updated: " + p);
        } else {
            System.out.println("Product not found.");
        }
    }

    // Delete product
    public void deleteProduct(int productId) {
        Product removed = inventory.remove(productId);
        if (removed != null) {
            System.out.println("Product removed: " + removed);
        } else {
            System.out.println("Product not found.");
        }
    }

    // Display all products
    public void showAllProducts() {
        System.out.println("----- Inventory List -----");
        for (Product p : inventory.values()) {
            System.out.println(p);
        }
    }
}
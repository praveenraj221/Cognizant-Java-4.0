package InventoryManagementSystem;

public class InventoryMain {
    public static void main(String[] args) {
        InventoryManager manager = new InventoryManager();

        // Add products
        manager.addProduct(new Product(101, "Mouse", 10, 599.0));
        manager.addProduct(new Product(102, "Keyboard", 5, 999.0));
        manager.addProduct(new Product(103, "Monitor", 3, 8999.0));

        // Update product
        manager.updateProduct(102, "Mechanical Keyboard", 7, 1299.0);

        // Delete product
        manager.deleteProduct(101);

        // Show all
        manager.showAllProducts();
    }
}

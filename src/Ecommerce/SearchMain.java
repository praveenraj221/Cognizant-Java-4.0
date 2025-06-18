package Ecommerce;

public class SearchMain {
    public static void main(String[] args) {
        Product[] products = {
                new Product(1, "Laptop", "Electronics"),
                new Product(2, "Shirt", "Fashion"),
                new Product(3, "Mouse", "Electronics"),
                new Product(4, "Shoes", "Footwear"),
                new Product(5, "Watch", "Accessories")
        };

        // 🔍 Linear Search
        Product found1 = SearchEngine.linearSearch(products, "Mouse");
        System.out.println("Linear Search: " + (found1 != null ? found1 : "Product not found"));

        // 🔍 Binary Search (must sort first)
        SearchEngine.sortByName(products);
        Product found2 = SearchEngine.binarySearch(products, "Mouse");
        System.out.println("Binary Search: " + (found2 != null ? found2 : "Product not found"));
    }
}
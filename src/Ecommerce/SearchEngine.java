package Ecommerce;

import java.util.Arrays;
import java.util.Comparator;

public class SearchEngine {

    // Linear Search by Name
    public static Product linearSearch(Product[] products, String name) {
        for (Product p : products) {
            if (p.productName.equalsIgnoreCase(name)) {
                return p;
            }
        }
        return null;
    }

    // Binary Search by Name (requires sorted array)
    public static Product binarySearch(Product[] products, String name) {
        int low = 0, high = products.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            int compare = name.compareToIgnoreCase(products[mid].productName);

            if (compare == 0) return products[mid];
            else if (compare < 0) high = mid - 1;
            else low = mid + 1;
        }

        return null;
    }

    // Helper method to sort products by name
    public static void sortByName(Product[] products) {
        Arrays.sort(products, Comparator.comparing(p -> p.productName.toLowerCase()));
    }
}
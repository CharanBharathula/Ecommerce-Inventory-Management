package EcommerceInventory;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class InventoryManagement {
    public static void main(String[] args) {
        Electronics lap = new Electronics("1", "Laptop", 50000, 10);
        Electronics mob = new Electronics("4", "Mobile", 20000, 15);
        Electronics tv = new Electronics("5", "TV", 30000, 5);
        Electronics ac = new Electronics("6", "AC", 40000, 10);
        Electronics fridge = new Electronics("7", "Fridge", 25000, 20);

        Clothing shirt = new Clothing("2", "Shirt", 1000, 20, "M");
        Clothing pant = new Clothing("8", "Pant", 1500, 10, "L");
        Clothing tshirt = new Clothing("9", "T-Shirt", 500, 30, "S");
        Clothing jeans = new Clothing("10", "Jeans", 2000, 15, "XL");
        Clothing saree = new Clothing("11", "Saree", 3000, 25, "S");

        Book javaBook = new Book("3", "Java", 500, 5, "James Gosling");
        Book pythonBook = new Book("12", "Python", 600, 10, "Guido van Rossum");
        Book cppBook = new Book("13", "C++", 400, 8, "Bjarne Stroustrup");
        Book cBook = new Book("14", "C", 300, 7, "Dennis Ritchie");


        RecentlyViewedItems recentlyViewedItems = new RecentlyViewedItems();

        Inventory<Electronics> electronicsInventory = new Inventory<>();
        electronicsInventory.addItem(lap, recentlyViewedItems);
        electronicsInventory.addItem(mob, recentlyViewedItems);
        electronicsInventory.addItem(tv, recentlyViewedItems);
        electronicsInventory.addItem(ac, recentlyViewedItems);
        electronicsInventory.addItem(fridge, recentlyViewedItems);

        Inventory<Clothing> clothingInventory = new Inventory<>();
        clothingInventory.addItem(shirt, recentlyViewedItems);
        clothingInventory.addItem(pant, recentlyViewedItems);
        clothingInventory.addItem(tshirt, recentlyViewedItems);
        clothingInventory.addItem(jeans, recentlyViewedItems);
        clothingInventory.addItem(saree, recentlyViewedItems);

        Inventory<Book> bookInventory = new Inventory<>();
        bookInventory.addItem(javaBook, recentlyViewedItems);
        bookInventory.addItem(pythonBook, recentlyViewedItems);
        bookInventory.addItem(cppBook, recentlyViewedItems);
        bookInventory.addItem(cBook, recentlyViewedItems);


//        System.out.println("Electronics Inventory: ");
//
//        for (Item item : electronicsInventory.getItems()) {
//            System.out.println(item.getName());
//        }

        // Recently viewed items - use LRU cache using LinkedList to maintain easily add and remove items
        recentlyViewedItems.displayRecentlyViewedItems();
    }
}

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

        Inventory<Electronics> electronicsInventory = new Inventory<>();
        electronicsInventory.addItem(lap);
        electronicsInventory.addItem(mob);
        electronicsInventory.addItem(tv);
        electronicsInventory.addItem(ac);
        electronicsInventory.addItem(fridge);

        Inventory<Clothing> clothingInventory = new Inventory<>();
        clothingInventory.addItem(shirt);
        clothingInventory.addItem(pant);
        clothingInventory.addItem(tshirt);
        clothingInventory.addItem(jeans);
        clothingInventory.addItem(saree);

        Inventory<Book> bookInventory = new Inventory<>();
        bookInventory.addItem(javaBook);
        bookInventory.addItem(pythonBook);
        bookInventory.addItem(cppBook);
        bookInventory.addItem(cBook);


        System.out.println("Electronics Inventory Before Sorting: ");

        for (Item item : electronicsInventory.getItems()) {
            System.out.println(item.getName());
        }
        Collections.sort(electronicsInventory.getItems());
        System.out.println("Electronics Inventory After Sorting: ");
        for (Item item : electronicsInventory.getItems()) {
            System.out.println(item.getName());
        }
    }
}

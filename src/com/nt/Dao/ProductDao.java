package com.nt.Dao;

import java.util.Scanner;
import com.nt.entity.Product;

public class ProductDao {

    ProductQueries pq = new ProductQueries(); // Correct instance

    // Register a single product
    public void register(Scanner sc) {
        try {
            System.out.println("Enter menu id:");
            int id = sc.nextInt();
            sc.nextLine(); // Consume leftover newline

            System.out.println("Enter name:");
            String name = sc.nextLine();

            System.out.println("Enter price:");
            float price = sc.nextFloat();
            sc.nextLine();

            System.out.println("Enter quantity:");
            int qty = sc.nextInt();
            sc.nextLine();

            System.out.println("Enter quality:");
            String qlty = sc.nextLine();

            System.out.println("Enter manufacture date:");
            String man_date = sc.nextLine();

            System.out.println("Enter expiry date:");
            String exp_date = sc.nextLine();

            Product p = new Product(id, name, price, qty, qlty, man_date, exp_date);
            pq.register(p); // Save to DB

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    // Add 10 products
    public void addnewUser(Scanner sc) {
        for (int i = 0; i < 10; i++) {
            System.out.println("\nAdding product " + (i + 1));
            register(sc); // Reuse register method
        }
    }

    // Other operations
    public void updateProductPrice(int id, float newPrice) {
        pq.updatePrice(id, newPrice);
    }

    public void updateProductName(int id, String newName) {
        pq.updateName(id, newName);
    }

    public void deleteProduct(int id) {
        pq.deleteProduct(id);
    }

    public void showAllProducts() {
        pq.selectAll();
    }

    public void showProductById(int id) {
        pq.selectById(id);
    }

    public void showProductsByPrice(float price) {
        pq.selectByPrice(price);
    }

    public void showProductsByName(String name) {
        pq.selectByName(name);
    }

    public void showProductsPriceAbove(float price) {
        pq.selectByPriceGreaterThan(price);
    }

    public void showProductsPriceBetween(float min, float max) {
        pq.selectByPriceBetween(min, max);
    }
}

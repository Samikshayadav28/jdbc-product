package com.nt.entity;

import java.util.Scanner;

import com.nt.Dao.ProductDao;
import java.util.Scanner;

public class Starter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ProductDao dao = new ProductDao();

        while (true) {
            System.out.println("\n===== Product Management Menu =====");
            System.out.println("1. Register a new product");
            System.out.println("2. Add 10 products");
            System.out.println("3. Update product price");
            System.out.println("4. Update product name");
            System.out.println("5. Delete a product");
            System.out.println("6. Show all products");
            System.out.println("7. Show product by ID");
            System.out.println("8. Show products by price");
            System.out.println("9. Show products by name");
            System.out.println("10. Show products with price >= 500");
            System.out.println("11. Show products with price between 100 and 600");
            System.out.println("12. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    dao.register(sc);
                    break;

                case 2:
                    dao.addnewUser(sc);
                    break;

                case 3:
                    System.out.print("Enter product ID to update price: ");
                    int idPrice = sc.nextInt();
                    System.out.print("Enter new price: ");
                    float newPrice = sc.nextFloat();
                    dao.updateProductPrice(idPrice, newPrice);
                    break;

                case 4:
                    System.out.print("Enter product ID to update name: ");
                    int idName = sc.nextInt();
                    System.out.print("Enter new name: ");
                    String newName = sc.next();
                    dao.updateProductName(idName, newName);
                    break;

                case 5:
                    System.out.print("Enter product ID to delete: ");
                    int delId = sc.nextInt();
                    dao.deleteProduct(delId);
                    break;

                case 6:
                    dao.showAllProducts();
                    break;

                case 7:
                    System.out.print("Enter product ID to search: ");
                    int searchId = sc.nextInt();
                    dao.showProductById(searchId);
                    break;

                case 8:
                    System.out.print("Enter price to search: ");
                    float searchPrice = sc.nextFloat();
                    dao.showProductsByPrice(searchPrice);
                    break;

                case 9:
                    System.out.print("Enter name to search: ");
                    String searchName = sc.next();
                    dao.showProductsByName(searchName);
                    break;

                case 10:
                    dao.showProductsPriceAbove(500);
                    break;

                case 11:
                    dao.showProductsPriceBetween(100, 600);
                    break;

                case 12:
                    System.out.println("Exiting... Thank you!");
                    sc.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}

/*
 * public class Starter { public static void main(String[] args) {
 * 
 * ProductDao dm=new ProductDao(); Scanner sc=new Scanner(System.in); while
 * (true) { System.out.println("Enter your choice");
 * System.out.println("1. Add new menu");
 * System.out.println("2. View all menus");
 * System.out.println("3. View your order");
 * System.out.println("4. View Category"); System.out.println("5. Update menu");
 * System.out.println("6. Delete menu"); System.out.println("7. Exit");
 * 
 * int choice = Integer.parseInt(sc.nextLine());
 * 
 * switch (choice) { case 1: dm.register(sc); break; case 2:
 * dm.insertRecords(sc); break;
 * 
 * case 3: dm.viewYourMenus(sc); break; case 4:dm.viewCategory(sc); break; case
 * 5: dm.updateMenus(sc); break; case 6: dm.deleteMenus(sc); break;
 * 
 * case 7: System.exit(0); default: System.out.println("Invalid choice."); }
 * 
 * } }
 * 
 * }
 */
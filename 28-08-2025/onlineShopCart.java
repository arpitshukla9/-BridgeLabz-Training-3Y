// Wrote a program to simulate online shopping : Show Product menu using Switch case 
// Let Customer add n items using for loop
// if total >500 apply discount using if else
// use while loop to handle  multiple customers
// ensure customer add atleasr one Product using do while loop


import java.util.*;
public class onlineShopCart {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] products = {"1. Shoes - Rs. 300", "2. Bag - Rs. 250", "3. Watch - Rs. 400"};
        int[] prices = {300, 250, 400};

        boolean moreCustomers = true;
        while (moreCustomers) {
            System.out.println("Welcome to Online Shop!");
            int total = 0;
            int items = 0;

            do {
                System.out.println("Product Menu:");
                for (String product : products) {
                    System.out.println(product);
                }
                System.out.print("Select product (1-3): ");
                int choice = sc.nextInt();
                switch (choice) {
                    case 1:
                    case 2:
                    case 3:
                        total += prices[choice - 1];
                        items++;
                        break;
                    default:
                        System.out.println("Invalid choice.");
                }
                System.out.print("Add another item? (y/n): ");
            } while (sc.next().equalsIgnoreCase("y"));

            if (total > 500) {
                System.out.println("Discount applied! 10% off.");
                total = (int)(total * 0.9);
            }
            System.out.println("Total items: " + items);
            System.out.println("Total bill: Rs. " + total);

            System.out.print("Next customer? (y/n): ");
            moreCustomers = sc.next().equalsIgnoreCase("y");
        }
    }
}
import java.util.ArrayList;
import java.util.Scanner;

class Expense {
    String description;
    double amount;
    String category;

    public Expense(String description, double amount, String category) {
        this.description = description;
        this.amount = amount;
        this.category = category;
    }
}

public class Expensetracker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Expense> expenses = new ArrayList<>();
        
        while (true) {
            System.out.println("\nExpense Tracker");
            System.out.println("1. Add Expense");
            System.out.println("2. View Expenses");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            
            if (choice == 1) {
                System.out.print("Enter description: ");
                String description = scanner.nextLine();
                System.out.print("Enter amount: ");
                double amount = scanner.nextDouble();
                scanner.nextLine();
                System.out.print("Enter category: ");
                String category = scanner.nextLine();
                
                expenses.add(new Expense(description, amount, category));
                System.out.println("Expense added successfully!");
            } else if (choice == 2) {
                System.out.println("\nExpenses List:");
                for (Expense e : expenses) {
                    System.out.println("Description: " + e.description + ", Amount: " + e.amount + ", Category: " + e.category);
                }
            } else if (choice == 3) {
                System.out.println("Exiting... Goodbye!");
                break;
            } else {
                System.out.println("Invalid option! Try again.");
            }
        }
        
        scanner.close();
    }
}


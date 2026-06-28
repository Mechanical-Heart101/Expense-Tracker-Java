import java.util.Scanner;

public class ExpenseTrackerApp {

    public static void main(String[] args) {
        ExpenseTracker expenseTracker = new ExpenseTracker(); // a new expense tracker object
        Scanner scanner = new Scanner(System.in); // a new scanner object

        boolean running = true;

        while (running) {
            System.out.println("===== Expense Tracker =====");
            System.out.println("1. Add Category");
            System.out.println("2. View Categories");
            System.out.println("3. Remove Category");
            System.out.println("4. Add Expense");
            System.out.println("5. View Expenses");
            System.out.println("6. Remove Expense");
            System.out.println("7. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) 
            {
                case 1: // add a new category
                    System.out.println("CategoryID: ");
                    String categoryID = scanner.nextLine();

                    System.out.println("Category Name: ");
                    String categoryName = scanner.nextLine();

                    expenseTracker.addCategory(categoryID, categoryName);
                    System.out.println("Category successfully added");

                    break;

                case 2: // viewing categories
                    expenseTracker.displayCategories();

                    break;

                case 3: // removing a category
                    System.out.println("Remove Category ID: ");
                    categoryID = scanner.nextLine();

                    expenseTracker.removeCategory(categoryID);

                    break;

                case 4: // add a new expense
                    System.out.println("Description: ");
                    String description = scanner.nextLine();

                    System.out.println("Amount: ");
                    double amount = scanner.nextDouble();
                    scanner.nextLine();

                    System.out.println("CategoryID: ");
                    categoryID = scanner.nextLine();

                    Category category = expenseTracker.findCategoryByID(categoryID);

                    if (category == null)
                    {
                        System.out.println("Category not found. Expense not added.");
                    }
                    else
                    {
                        expenseTracker.addExpense(description, amount, category);
                        System.out.println("Expense successfully added.");
                    }
    
                    break;

                case 5: // this case is for viewing the expenses
                    expenseTracker.displayExpenses();

                    break;

                case 6: // this case is for removing expenses
                    System.out.println("Description: ");
                    description = scanner.nextLine();

                    expenseTracker.removeExpense(description);

                    break;

                case 7: // this is for exiting the program

                    running = false;
                    break;

                default: // the default option

                    System.out.println("Invalid input. Please select correctly.");
            }

        }
        scanner.close(); // close the scanner to prevent memory leaks

    }
}

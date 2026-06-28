import java.util.ArrayList;

public class ExpenseTracker
{
    private final ArrayList<Expense> expenses;
    private final ArrayList<Category> categories;

    /**
     * This is the constructor for the expensetracker class
     */
    public ExpenseTracker()
    {
        expenses = new ArrayList<>(); // expenses is a new collection of expense objects
        categories = new ArrayList<>(); // a new collection of category objects

    }

    /**
     * This is the add category method. IT adds a new category to the list categoires
     * @param String newCategoryID
     * @param String newCategoryName
     */
    public void addCategory(String newCategoryID, String newCategoryName)
    {
        Category newCategory = new Category(newCategoryID, newCategoryName);
        boolean found = false;
        
        for (Category category : categories)
        {
            if (category.getCategoryID().equals(newCategory.getCategoryID())) // comparing the strings
            {
                found = true;
            }
        }

        if (found == false)
        {
            categories.add(newCategory);
        }
        else
        {
            System.out.println("This category already exists.");
        }

    }

    /**
     * This is the display category method for the expensetracker class. It displays all the categories in the list categories
     * 
     */
    public void displayCategories()
    {
        for (Category category : categories)
        {
            System.out.println(category);
        }
    }

    /**
     * This is the remove category method for the expensetracker class. It removes a category from the list categories
     * @param String Category unique identifier
    */
    public void removeCategory(String categoryID)
    {
        boolean found = false;

        Category removeCategory = null; // creating a variable to store the category object that we want to remove. We only need the categoryID to find the category, so the name is set to an empty string.

        for (Category category : categories)
        {
            if (category.getCategoryID().equals(categoryID))
            {
                found = true;
                removeCategory = category; // if the category is found, we store it in the variable removeCategory so that we can remove it later;
            }
        }
        
        if (found == true)
        {
            categories.remove(removeCategory);
            System.out.println("The category has been successfully removed.");
        }
        else
        {
            System.out.println("There is no such category in the system.");
        }

    }

    /** This is the add Expense method for the expenseTracker class.
     * @param String description
     * @param double amount
     * @param Category category
     */
    public void addExpense(String description, double amount, Category category)
    {
        Expense newExpense = new Expense(description, amount, category); // make a new expense object
        boolean found = false;

        for (Expense expense : expenses)
        {
            if (expense.getID() == newExpense.getID())
            {
                found = true;
            }
        }
        
        if (found == false)
        {
            expenses.add(newExpense); // add it to the list of expenses.
        }
        else
        {
            System.out.println("This expense already exists!");
        }

    }

    /**
     * This is a method to remove expenses. it uses the expense category
     * @param String the description of the expense.
     */
    public void removeExpense(String description)
    {
        Expense expenseToRemove = null;

        for (Expense expense : expenses)
        {
            if (expense.getDescription().equals(description))
            {
                expenseToRemove = expense; 
                break;
            }
 
        }
        if (expenseToRemove != null)
        {
            expenses.remove(expenseToRemove);
            System.out.println("This expense has been successfully removed.");
        }
        else
        {
            System.out.println("Expense not found.");
        }
    }

    /**
     * This method finds category by ID
     * @param String categoryID
     */
    public Category findCategoryByID(String categoryID)
    {
        Category foundCategory = null;

        for (Category category : categories)
        {
            if (category.getCategoryID().equals(categoryID))
            {
                foundCategory = category;
            }
        }
        return foundCategory;
    }

    /**
     * This method displays an expenses in the ArrayList
     * 
     */
    public void displayExpenses()
    {
        for (Expense expense : expenses)
        {
            System.out.println(expense);
        }
    }
}
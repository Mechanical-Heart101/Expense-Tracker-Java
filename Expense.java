public class Expense
{
    private String description;
    private double amount;
    private Category category;
    private static int counter = 1;
    private final int id;

    public Expense(String description, double amount, Category category)
    {
        this.description = description;
        this.amount = amount;
        this.category = category;
        this.id = counter++;
    }

    /**
     * This is the setter method for description
     * @param String the category description
     */
    public void setDescription(String newDescription)
    {
        this.description = newDescription;
    }

    /**
     * This is the getter method for the category description
     * @return String category description
     */
    public String getDescription()
    {
        return this.description;   
    }

    /**
     * This is a method to set the amount
     * @param double newAmount
     */
    public void setAmount(double newAmount)
    {
        this.amount = newAmount;
    }

    /**
     * This is the method to get the amount spent on this expense
     * @return double amount
     */
    public double getAmount()
    {
        return this.amount;
    }

    /**
     * This is the method to set the category of the expense
     * @param Category categoryName
     */
    public void setCategory(Category categoryName)
    {
        this.category = categoryName;
    }

    /**
     * This is the method to get the category of the expense
     * @return Category category
     */
    public Category getCategory()
    {
        return this.category;
    }

    /**
     * This method return the ID of the instance Expense
     */
    public int getID()
    {
        return id;
    }

    /**
     * This is the tostring method for the expense class
     */
    @Override
    public String toString()
    {
        return "Expense: " + getDescription() +
                ",  Amount spent: " + getAmount() +
                ", Category: " + getCategory();
    }
}
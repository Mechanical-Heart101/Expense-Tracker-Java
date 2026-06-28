/**
 * This class is meant to represent the behaviur of the category object in the app.
 */

public class Category
{
    private String categoryID;
    private String name;

    public Category(String categoryID, String name)
    {
        this.categoryID = categoryID;
        this.name = name;
    }

    /**
     * This is the setter method for the category Name
     * @param String name
     */
    public void setCategoryName(String categoryName)
    {
        name = categoryName;
    }

    /**
     * This is the getter method for the category name
     * @return String category name
     */
    public String getCategoryName()
    {
        return name;
    }

    /**
     * This is the setter method for the categoryID
     * @param String new categoryID
     */
    public void setCategoryID(String newCategoryID)
    {
        categoryID = newCategoryID;
    }

    /**
     * This is the getter method for categoryID
     * @return String categoryID
     */
    public String getCategoryID()
    {
        return categoryID;
    }

    /**
     * This is the toString method for the category class
     * @return String tostring
     */
    @Override
    public String toString()
    {
        return "Name: " + getCategoryName() +
                ", Category ID: " + getCategoryID();
    }

    



}
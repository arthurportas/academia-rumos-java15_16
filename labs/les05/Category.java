
public class Category {

  public int categoryID = 0; // Default ID for the customer
  public String name = "-name required-"; // default
  

  // This method displays the values for an item
  public void displayCategoryInfo() {
    System.out.println("********Category Information********");
    System.out.println("Category ID: " + categoryID);
    System.out.println("Name:" + name);
    System.out.println("************************************");
  } // end of display method
} // end of class




/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class CategoryTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Category cust1, cust2;
        cust1 = new Category();
        cust2 = new Category();
        
        // Assign values to member fields
        cust1.categoryID = 1;
        cust1.name = "Mary Smith";
        cust2.categoryID = 2;
        cust2.name = "Frank Jones";
        
        // Display customer info for each object
        cust2 = cust1;
        cust1.displayCategoryInfo();
        cust2.displayCategoryInfo();
    }
}

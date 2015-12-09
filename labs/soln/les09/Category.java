/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class Category {
    public int categoryID = 0; // Default ID for the customer
    public String name = "-name required-"; // default
    public int categoryGroup = 0;
    
    public void setCategoryInfo(int Id, String nm, int group){
        categoryID = Id;
        name = nm;
        categoryGroup = group;
    }
    
    public void setCategoryInfo(int Id,String nm){
        categoryID = Id;
        name = nm;
        categoryGroup = 1;
    }
    
    public void display(){
        System.out.println("Category ID: "+categoryID);
        System.out.println("Category name: "+name);
        System.out.println("Category group: "+categoryGroup);
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Utilizador
 */
public class Category {

    private int categoryID;
    private String name = "-name required-";
    private int categoryGroup;

    //--------------CONTRUCTORS

    public Category() {
        this.name = "NOT SET";
    }

    public Category(int categoryID) {
        this.categoryID = categoryID;
    }
//    public Category(int categoryGroup) {
//        this.categoryGroup = categoryGroup;
//    }
    
    public Category(int categoryID, int categoryGroup) {
        //this.categoryID = categoryID;
        this(categoryID);// public Category(int categoryID)
        this.categoryGroup = categoryGroup;
    }
    public Category(int categoryID, int categoryGroup, String name) {
        this.categoryID = categoryID;
        this.categoryGroup = categoryGroup;
        this.name = name;
    }
    
    //--------------GETTERS/SETTERS
    
//    public String getName(){
//        return name;
//    }
//    
//    public void setName(String newName) {
//        name = newName;
//    }
    
    
    //--------------------------------
    public void setCategoryInfo(int Id, String nm, int group) {

        categoryID = Id;
        this.name = nm;
        this.categoryGroup = group;

    }

    public void setCategoryInfo(int Id, String nm) {

        this.categoryID = Id;
        this.name = nm;
    }

    public void display() {
        StringBuilder sb = new StringBuilder();
        sb.append("categoryID:")
                .append(" ")
                .append(categoryID)
                .append(" ")
                .append("name:")
                .append(" ")
                .append(name)
                .append(" ")
                .append("categoryGroup:")
                .append(" ")
                .append(categoryGroup);
        System.out.println(sb.toString());
    }

    public void display(boolean displayCategoryGroup) {
        StringBuilder sb = new StringBuilder();
        sb.append("categoryID:")
                .append(" ")
                .append(categoryID)
                .append(" ")
                .append("name:")
                .append(" ")
                .append(name);
        if (displayCategoryGroup) {
            sb.append(" ")
                    .append("categoryGroup:")
                    .append(" ")
                    .append(categoryGroup);
        }
        System.out.println(sb);
    }

    @Override
    public String toString() {
        return "Category{" + "categoryID=" + 
                categoryID + ", name=" + name + ", categoryGroup=" + categoryGroup + '}';
    }

    //--------------GETTERS/SETTERS
    public int getCategoryID() {
        return categoryID;
    }

    public void setCategoryID(int categoryID) {
        this.categoryID = categoryID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCategoryGroup() {
        return categoryGroup;
    }

    public void setCategoryGroup(int categoryGroup) {
        this.categoryGroup = categoryGroup;
    }

}

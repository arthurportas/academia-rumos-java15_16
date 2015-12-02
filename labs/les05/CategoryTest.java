/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Utilizador
 */
public class CategoryTest {
    
    public static void main(String[] args) {
        
        Category category1, category2;
        
        category1 = new Category();
        category2 = new Category();
        
        System.out.println("Initializing Object Instances");
        category1.categoryID = 1;
        category2.categoryID = 2;
        
        System.out.println("-------CATEGORY 1---------------");
        category1.displayCategoryInfo();
        System.out.println("-------CATEGORY 2---------------");
        category2.displayCategoryInfo();
        
        
        
        System.out.println("Manipulating Object References");
        category2 = category1;
        System.out.println("-------CATEGORY 1---------------");
        category1.displayCategoryInfo();
        System.out.println("-------CATEGORY 2---------------");
        category2.displayCategoryInfo();
        
       
    }
}

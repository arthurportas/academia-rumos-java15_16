/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class CategoryTest {
   
  public static void main (String args[]) {

      Category category1 = new Category();
      Category category2 = new Category();
      category2.setCategoryInfo(2, "category2",100);
      category1.setCategoryInfo(1, "category1");
      System.out.println("------category1-----");
      System.out.println(category1.toString());
     // category1.display();
      //category2.setCategoryInfo(2, "category2", 100);
      System.out.println("------category2-----");
      //category2.display();
      
      category2.display( true );
      
      //category2.display( false );
      
      
      //category1.name = "sdafcs";
      category1.getName();
  } 
}

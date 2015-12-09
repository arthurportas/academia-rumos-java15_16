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
      Category c1 = new Category(),
               c2 = new Category();
      c1.setCategoryInfo(1, "Harry");
      c2.setCategoryInfo(2, "Sally",2);
      c1.display();
      c2.display();
  } 
}

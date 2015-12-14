
public class RectangleTest {
  public static void main(String args[]){
	
      Rectangle r1 = new Rectangle();
      System.out.println("-----------r1-------");
      r1.draw();
      
      Rectangle r2 = new Rectangle( 6, 4);
      System.out.println("-----------r2-------");
      r2.draw();
      r2.getArea();
      
  }// end main
} // end class

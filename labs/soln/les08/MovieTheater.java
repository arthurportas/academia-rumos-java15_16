
public class MovieTheater {
    public String[][] chairArray;
    public String name;
    
    public void setChairMap(){
        chairArray = new String[3][4];
    }
    
    public void setChair(){
        boolean flag = false;
        for (int row = 0; row < 3; row++) { // start of row loop
            for (int col = 0; col < 4; col++) { // start of column loop
                if (chairArray[row][col] == null) {
                    chairArray[row][col] = name;
                    System.out.println(name + "  chair set at position: Row:"
                             + row + " Column:" + col);
                    flag = true;
                    break; // drop out of column loop
                } // end of if
            } // end of inner/column loop
            if (flag == true) {
                break;
            } // end of if
        } // end of outer/row loop
        if (flag == false) {
            System.out.println("All chairs occupied.");
        } // end of if
    }
    
    //method to diplay the desk map of the class
    public void displayChairMap() {
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 4; col++) {
                System.out.print("  " + chairArray[row][col] + "  ");
            }
            System.out.println();
        }

    }//end method
    
    //Challenge Practice: method to search the desk of a student
    public void searchChair() {
        boolean flag = false;
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 4; col++) {
                if (chairArray[row][col] != null && chairArray[row][col].equals(name)) {
                    System.out.println(name + "  chair Position:  Row:  " +row+ "  Column:  "+col);
                    flag = true;
                    break;
                }
            }
            if (flag == true) {
                break;
            }
        }
        if (flag == false) {
            System.out.println("Chair not allocated for:   " + name);
        }
    } //end method
}

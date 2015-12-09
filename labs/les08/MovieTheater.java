/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Utilizador
 */
class MovieTheater {
    
    public String[][] chairArray;
    String name;
    boolean chairAssigned;
    
    void setChairMap() {
        chairArray = new String[3][4];
    }

    void setChair() {
        chairAssigned = false;
        for( int row=0; row<3; row++ ){
            for( int col=0; col<4; col++ ){
                 
                if( chairArray[row][col] == null ){
                    chairArray[row][col] = name;
                    chairAssigned = true;
                     System.out.println("Chair assigned to: " + name + " at: row[" + row + "]col[" + col + "]");
                }
                if( chairAssigned ) {
                    break;
                }
            }
            if( chairAssigned ) {
                break;
            }
            
        }
        if( !chairAssigned ) {
            System.out.println("All chairs are occupied");
        }
       
    }

    void displayChairMap() {

        for( int row=0; row<3; row++ ){
            for( int col=0; col<4; col++ ){
                if( null != chairArray[row][col] ){
                    System.out.print("[" + chairArray[row][col] + "]");
                }else {
                    System.out.print("[" +  "null" + "]");
                }
            }
            System.out.println("");
        } 
    }

    void searchChair() {

        boolean found = false;
        
        for( int row=0; row<3; row++ ){
            for( int col=0; col<4; col++ ){
                if( name.equals(chairArray[row][col]) ){
                    found = true;
                    System.out.println("Chair found at " + "[" + chairArray[row][col] + "]");
                    break;
                } 
            }
            if( found ) {
                break;
            }
        }
        if( !found ) {
            System.out.println("Chair for: " + name + " not found!");
        }
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Utilizador
 */
class SimpleGameFor {

    public static final int SEQUENCE_LIMIT = 100;
    public static final int SEQUENCE_COUNT = 10;
     
    int firstNumber = 0;
    int secondNumber = 1;
    int nextNumber;
    
    public void displaySequence(){
        System.out.print(firstNumber + " " + secondNumber + " ");
        nextNumber = firstNumber +  secondNumber;
        while ( nextNumber <= SEQUENCE_LIMIT) {            
            System.out.print( nextNumber + " " );
            firstNumber  = secondNumber;
            secondNumber = nextNumber;
            nextNumber = firstNumber +  secondNumber;
        }
        System.out.println();
    }
    void displaySequenceWithForLoop() {

     System.out.print( firstNumber + " " + secondNumber + " " );
        nextNumber = firstNumber +  secondNumber;
        for ( int i = 0; i < SEQUENCE_COUNT; i++ ) {
            System.out.print( nextNumber + " ");
            firstNumber  = secondNumber;
            secondNumber = nextNumber;
            nextNumber = firstNumber +  secondNumber;
        }
        System.out.println();
    }
    
}

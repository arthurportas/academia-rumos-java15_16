/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Utilizador
 */
public class Euromillions {

    

    public static void main(String[] args) {
        
        if ( args[0].compareTo("help") == 0 ) {
            System.out.println("Enter a number between 1 and 5");
        }
        int guess = Integer.parseInt(args[0]);
        
        int randomNum = 0;
        randomNum = ((int)(Math.random()*5)+1);
        
        if( guess == randomNum ) {
            System.out.println("Congratulations");
            System.out.println("Great guess…");
        } else {
            System.out.println("Sorry. …Try again.");
        }
    }
}

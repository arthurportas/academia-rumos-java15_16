
public class Euromillions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     int randomNum = 0;
        int guess;
        
        if (args.length == 0 || args[0].compareTo("help") == 0){
            System.out.println ("Usage: java Euromillions [argument]");
            System.out.println();
            System.out.println ("Enter a number from 1 - 5 as your guess.");
        }
        else {
            randomNum = ((int) (Math.random()*5) + 1);
            guess = Integer.parseInt(args[0]);
            
            if (guess < 1 || guess > 5) {
                System.out.println ("Invalid argument: Enter a value between 1 and 5 only");
            }
            else {
                if (guess == randomNum) {
                    System.out.println ("Great guess!  You got it right!");
                }
                else {
                    System.out.println("Sorry.  The number was "+ randomNum + 
				". Try again.");
                } // end of innermost nested if (argument == randomNum)
            } // end of first nested if
        } // end of outer if                       
    } // end of main method
}

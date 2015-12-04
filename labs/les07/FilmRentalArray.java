/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Utilizador
 */
public class FilmRentalArray {
    
    private static final int DISCOUNT_SCALE = 7;
    private static final int MAX_DISCOUNT = 6;
    
    /*
    The following table shows the discount scale for Duke’s Choice:
    Number of Rented Films 	%Discount
    0                               0
    1, 2, or 3 films                15
    4 or 5 films                    20
    6 or more films                 25
    */
    int[] filmsRentedDiscount; //represent a discount table
    int filmsRented;

    /**
     * Initialize array instance and populate with values
     */
    public void setFilmRentalArray() {
        filmsRentedDiscount = new int[DISCOUNT_SCALE];
        filmsRentedDiscount[0] = 0;
        filmsRentedDiscount[1] = 15;
        filmsRentedDiscount[2] = 15;
        filmsRentedDiscount[3] = 15;
        filmsRentedDiscount[4] = 20;
        filmsRentedDiscount[5] = 20;
        filmsRentedDiscount[6] = 25;
        
    }

    /**
     * To print all discount scales DEBUG purposes
     */
    public void displayFilmRentalArray() {

    }
    
    /**
     * Given number of rented films (filmsRented) , print correspondent discount
     * from table (filmsRentedDiscount)
     */
    public void displayFilmsRentedDiscount (){
        
        if( filmsRented > 6) {
            System.out.println("You've earned a " + filmsRentedDiscount[MAX_DISCOUNT] + "% discount!");
        } else if (filmsRented >= 0 ){
            System.out.println("You've earned a " + filmsRentedDiscount[filmsRented] + "% discount!");
        } else {
            displayError();
        }
    }

    /**
     * Display errors to console
     */
    private void displayError() {
        System.out.println("UNEXPECTED VALUE[" + filmsRented +"]");
    }
    
}


import java.util.ArrayList;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author administrator
 */
public class FilmRentalArray {
    
    public ArrayList filmsRentedDiscount;
    
    public void setVacationScale(){
        filmsRentedDiscount = new ArrayList(7);
        filmsRentedDiscount.add(10);
        filmsRentedDiscount.add(15);
        filmsRentedDiscount.add(15);
        filmsRentedDiscount.add(15);
        filmsRentedDiscount.add(20);
        filmsRentedDiscount.add(20);
        filmsRentedDiscount.add(25);
    }
    
    void displayVacationDays() {
        for ( int i = 0; i < filmsRentedDiscount.size(); i++ ) {
            System.out.println("Value: " + filmsRentedDiscount.get(i) + " at index: " + i);
        }
    }
}


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

    public void setVacationScale() {
        filmsRentedDiscount = new ArrayList(7);
        filmsRentedDiscount.add(0);
        filmsRentedDiscount.add(15);
        filmsRentedDiscount.add(15);
        filmsRentedDiscount.add(15);
        filmsRentedDiscount.add(20);
        filmsRentedDiscount.add(20);
        filmsRentedDiscount.add(25);
    }
    
    // Use a standard for loop to display values from the ArrayList
    public void displayVacationDays() {
        for (int films = 0; films < filmsRentedDiscount.size(); films++){
            System.out.println("The discount for "+ films + 
                    " films rented is: " + filmsRentedDiscount.get(films));
        }
    }
}

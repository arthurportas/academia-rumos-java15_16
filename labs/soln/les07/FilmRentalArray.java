
public class FilmRentalArray {

    public int[] filmsRentedDiscount;
    public int filmsRented;

    public void setFilmRentalArray() {
        filmsRentedDiscount = new int[7];
        filmsRentedDiscount[0] = 0;
        filmsRentedDiscount[1] = 15;
        filmsRentedDiscount[2] = 15;
        filmsRentedDiscount[3] = 15;
        filmsRentedDiscount[4] = 20;
        filmsRentedDiscount[5] = 20;
        filmsRentedDiscount[6] = 25;
    }
    
    public void displayFilmRentalArray(){
        if(filmsRented >= 0 && filmsRented < 6){
            System.out.println ("Discount: " + filmsRentedDiscount[filmsRented]);
        }else if(filmsRented >= 6){
            System.out.println ("Discount: " + filmsRentedDiscount[6]);
        }
        else {
            System.out.println ("Invalid number of Films Rented");
        } 
    }
}

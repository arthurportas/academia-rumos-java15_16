
public class FilmRentalArrayTest {

    public static void main(String args[]) {

        FilmRentalArray myFilmRentalArray = new FilmRentalArray();

        myFilmRentalArray.setFilmRentalArray();

        System.out.println("----ONE FILM RENTAL----");
        myFilmRentalArray.filmsRented = 1;
        myFilmRentalArray.displayFilmsRentedDiscount();

        System.out.println("----FIVE FILM RENTAL----");
        myFilmRentalArray.filmsRented = 5;
        myFilmRentalArray.displayFilmsRentedDiscount();

        System.out.println("----TEN FILM RENTAL----");
        myFilmRentalArray.filmsRented = 10;
        myFilmRentalArray.displayFilmsRentedDiscount();
    }
}

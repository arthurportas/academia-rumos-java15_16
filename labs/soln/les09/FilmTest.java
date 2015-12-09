/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class FilmTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Actor actor1 = new Actor(),
                actor2 = new Actor(),
                actor3 = new Actor();
        Film film = new Film();
        int  actorsCount = 0;


        film.addActor(actor1);
        film.addActor(actor2);
        actorsCount = film.addActor(actor3);
        System.out.println("Total number of actors is " + actorsCount);
    }
}

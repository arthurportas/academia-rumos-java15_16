/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Utilizador
 */
class FilmRevenue {
    
    public int xpto = 99;
    public long revenueValue = 0L;
    public int movieGoers = 10000000;
    public int ticketPrice = 5;
    //public long result;
    
//    public void calculateRevenue() {
//       long result = ( long ) movieGoers * ticketPrice;
//       //System.out.println("Result: " + result);
//        print( result );
//    }

    public int calculateRevenue() {
       int result =  movieGoers * ticketPrice;
       //System.out.println("Result: " + result);
        return result;
    }
    
    private void print( long result ) {
        System.out.println( "Result: " + result );
    }
    
}

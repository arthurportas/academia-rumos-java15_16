/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Utilizador
 */
class GreetingTime {

    /**
     *Time of Day Part of Day
     *  8:01 to 12:00 Morning
     *  12:01 to 17:00 Afternoon
     * 17:01 to 24:00 Evening
     *   0:01 to 8:00 Early Morning
     */
    
    int currentTime = 1505;//(Example: 400 = 04:00, 1505 = 15:05)
    
    void displayPartOfDay() {

        if ( currentTime >= 001 && currentTime <= 800 ) {
            System.out.println( "Early Morning" );
        } else if( currentTime > 800 && currentTime <= 1200 ){
            System.out.println("Morning");
        } else if( currentTime > 1200 && currentTime <= 1700 ){
            System.out.println("Afternoon");
        }  else if( currentTime > 1700 && currentTime <= 2400 ){
            System.out.println("Evening");
        }
    }
    
}

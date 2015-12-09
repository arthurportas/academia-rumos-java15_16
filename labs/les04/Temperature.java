/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Utilizador
 */
class Temperature {

    float temperature;
    
    /**
     *Convert the Fahrenheit temperature from Celsius multiplying by 9, dividing by 5 and by adding 32.
     */
    void calculateFahrenheit() {
        temperature = ( ( temperature * 9 ) / 5 ) + 32;
        System.out.println( "Temperature(Fahrenheit): " + temperature );
    }
    
}

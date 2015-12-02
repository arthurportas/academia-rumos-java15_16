/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Utilizador
 */
class AgeCalc {

    public int year = 1;
    public int days;
    public long minutes;
    public long seconds;
    public long millis;
    
    
    void calculateAge() {
        days = year * 365;
        seconds = days * 24 * 60 * 60;
        minutes = seconds / 60;
        millis = seconds / 1000;
        
        print();
    }

    private void print() {
        
        System.out.println("You are " + year +" years old.");
        System.out.println("You are " + days +" days old.");
        System.out.println("You are " + minutes +" minutes old.");
        System.out.println("You are " + seconds +" seconds old.");
        System.out.println("You are " + millis +" millis old.");
    }
    
}

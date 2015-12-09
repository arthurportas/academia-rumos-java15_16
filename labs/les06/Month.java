/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Utilizador
 */
public class Month {
    
    int monthNumber = 12;
    
    public void displayMonth() {
        
        switch( monthNumber ) {
            
            case 1 : System.out.println("JANUARY");
                break;
            case 2 : System.out.println("FEBRUARY");
                break;
            case 3 : System.out.println("MARCH");
                break;
            case 4 : System.out.println("APRIL");
                break;
            case 5 : System.out.println("MAY");
                break;
            case 6 : System.out.println("JUNE");
                break;
            case 7 : System.out.println("JULY");
                break;
            case 8 : System.out.println("AUGUST");
                break;
            case 9 : System.out.println("SEPTEMBER");
                break;
            case 10 : System.out.println("OCTOBER");
                break;
            case 11 : System.out.println("NOVEMBER");
                break;
            case 12 : System.out.println("DECEMBER");
                break;
            default:
                System.out.println("INPUT ERROR");
                break;
        }
    }
}

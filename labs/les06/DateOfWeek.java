
import java.util.Calendar;
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Utilizador
 */
class DateOfWeek {

    private static final int MONDAY = 1;
    private static final int TUESDAY = 2;
    private static final int WEDNESDAY = 3;
    private static final int THURSDAY = 4;
    private static final int FRIDAY = 5;
    private static final int SATURDAY = 6;
    private static final int SUNDAY = 7;

    private static final String _MONDAY = "MONDAY";
    private static final String _TUESDAY = "TUESDAY";
    private static final String _WEDNESDAY = "WEDNESDAY";
    private static final String _THURSDAY = "THURSDAY";
    private static final String _FRIDAY = "FRIDAY";
    private static final String _SATURDAY = "SATURDAY";
    private static final String _SUNDAY = "SUNDAY";

    int dayNumber = 3;

    void displayDay() {
        if (dayNumber == MONDAY) {
            System.out.println("[TEXT]DAY OF WEEK: " + _MONDAY);
            System.out.println("[NUMBER]DAY OF WEEK: " + MONDAY);
        } else if (dayNumber == TUESDAY) {
            System.out.println("[TEXT]DAY OF WEEK: " + _TUESDAY);
            System.out.println("[NUMBER]DAY OF WEEK: " + TUESDAY);
        } else if (dayNumber == WEDNESDAY) {
            System.out.println("[TEXT]DAY OF WEEK: " + _WEDNESDAY);
            System.out.println("[NUMBER]DAY OF WEEK: " + WEDNESDAY);
        } else if (dayNumber == THURSDAY) {
            System.out.println("[TEXT]DAY OF WEEK: " + _THURSDAY);
            System.out.println("[NUMBER]DAY OF WEEK: " + THURSDAY);
        } else if (dayNumber == FRIDAY) {
            System.out.println("[TEXT]DAY OF WEEK: " + _FRIDAY);
            System.out.println("[NUMBER]DAY OF WEEK: " + FRIDAY);
        } else if (dayNumber == SATURDAY) {
            System.out.println("[TEXT]DAY OF WEEK: " + _SATURDAY);
            System.out.println("[NUMBER]DAY OF WEEK: " + SATURDAY);
        } else if (dayNumber == SUNDAY) {
            System.out.println("[TEXT]DAY OF WEEK: " + _SUNDAY);
            System.out.println("[NUMBER]DAY OF WEEK: " + SUNDAY);
        } else {
            System.out.println("ERROR: DAY OF WEEK OUT OF RANGE(1-7)");
        }
    }
    
    void displayDayWithSwitch() {
        
        switch(dayNumber){
            case 1 : 
                break;
            case 2 : 
                break;
            case WEDNESDAY : 
                break;
            case THURSDAY : 
                break;
            case FRIDAY : 
                break;
            case SATURDAY : 
                break;
            case SUNDAY : 
                System.out.println("[TEXT]DAY OF WEEK: " + _SUNDAY);
                System.out.println("[NUMBER]DAY OF WEEK: " + SUNDAY);
                break;
            default:
                break;
        }
    }

    void displayCurrentDay(){
        System.out.println("Calendar.DAY_OF_WEEK: " + Calendar.getInstance().get(Calendar.DAY_OF_WEEK));
    }
}

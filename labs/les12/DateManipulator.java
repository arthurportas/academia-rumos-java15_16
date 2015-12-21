
import java.text.ParseException;
import java.text.SimpleDateFormat;
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
class DateManipulator {

    private Date myDate;

    private SimpleDateFormat sdf;

    public Date getMyDate() {
        return myDate;
    }

    public void setMyDate(Date myDate) {
        this.myDate = myDate;
    }

    public DateManipulator() {
        sdf = new SimpleDateFormat("MM/dd/yyyy");
    }

    void parseDate(String dateString) {
        try {
            String formattedDateString;

            myDate = sdf.parse(dateString);
            System.out.println("parse method was successful");
            System.out.println("");
            System.out.println("natively formatted date object:" + myDate);

            formatDate(myDate);
//            formattedDateString = sdf.format(myDate);
//            System.out.println("FORMATTED: " + formattedDateString);
        } catch (ParseException pex) {
            System.out.println("EXCEPTION: " + pex.getMessage());
        }
    }
    
    private void formatDate (Date date) {
        System.out.println("FORMATTED: " + sdf.format(date));
    }

}


import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author administrator
 */
public class EmployeeTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Manager myManager = new Manager();
        Editor myEditor = new Editor();
        GraphicIllustrator myGI = new GraphicIllustrator();
        TechnicalWriter myTW = new TechnicalWriter();

        myEditor.setName("Fred Hanson");
        myEditor.setJobTitle("Editor");
        myEditor.calculateEmployeeId();
        myEditor.setLevel(1);
        myEditor.setSkill("technical editing");
        myEditor.setSkill("typing");
        myEditor.setPrefersPaperEditing(true);
        myEditor.displayInformation();
        System.out.println("**** *****");

        myGI.setJobTitle("Graphic Illustrator");
        myGI.setName("Frank Moses");
        myGI.calculateEmployeeId();
        myGI.setLevel(3);
        myGI.setSkill("technical illustration");
        myGI.setSkill("video production");
        myGI.setSkill("media authoring");
       // myGI.displayInformation();
        System.out.println("**** *****");

        myTW.setName("James Ralph");
        myTW.setJobTitle("Technical Writer");
        myTW.calculateEmployeeId();///suppose id = 2
        myTW.setLevel(1);
        myTW.setSkill("technical writing");
     //   myTW.displayInformation();
        System.out.println("**** *****");

        myManager.setName("Susan Smith");
        myManager.setJobTitle("Manager");
        myManager.calculateEmployeeId();
        myManager.setLevel(2);
        
        myManager.setEmployee(myEditor);//TODO: arthurportas missing work
        myManager.setEmployee(myGI);//TODO: arthurportas missing work
        myManager.setEmployee(myTW);//TODO: arthurportas missing work
       
        
        ///HERE
        myManager.displayInformation();
        
        //search for James
        Employee james;
        try {
            james = myManager.findById( 4 );
            if( null != james){
            System.out.println(myManager.findById( 2 ).toString());
            } else {
                System.out.println("ERRO ");
            }
        } catch (Exception ex) {
            Logger.getLogger(EmployeeTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("------------END---------------------");
        
        try {
            myManager.findById2(99);
        } catch (EmployeeNotFoundException enfe) {
            System.out.println(enfe.getMessage());
        } catch (Exception ex) {
            Logger.getLogger(EmployeeTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
//        try {
//            myManager.findById2(99);
//        } catch (Exception  enfe) {
//            System.out.println(enfe.getMessage());
//        } catch (EmployeeNotFoundException ex) {//never caught
//            Logger.getLogger(EmployeeTest.class.getName()).log(Level.SEVERE, null, ex);
//        }
        
        try {
            myManager.findById2(99);
        } catch (Throwable t) {
            System.out.println(t.getMessage());
        } 
    }
}

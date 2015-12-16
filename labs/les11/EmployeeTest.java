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
        myEditor.setSkill("technical editing");//TODO: arthurportas missing work
        myEditor.setSkill("typing");//TODO: arthurportas missing work
        myEditor.setPrefersPaperEditing(true);//TODO: arthurportas missing work
        myEditor.displayInformation();
        System.out.println("**** *****");

        myGI.setJobTitle("Graphic Illustrator");
        myGI.setName("Frank Moses");
        myGI.calculateEmployeeId();
        myGI.setLevel(3);
        myGI.setSkill("technical illustration");
        myGI.setSkill("video production");
        myGI.setSkill("media authoring");
        myGI.displayInformation();
        System.out.println("**** *****");

        myTW.setName("James Ralph");
        myTW.setJobTitle("Technical Writer");
        myTW.calculateEmployeeId();
        myTW.setLevel(1);
        myTW.setSkill("technical writing");
        myTW.displayInformation();
        System.out.println("**** *****");

        myManager.setName("Susan Smith");
        myManager.setJobTitle("Manager");
        myManager.calculateEmployeeId();
        myManager.setLevel(2);
        myManager.setEmployee(myEditor);//TODO: arthurportas missing work
        myManager.setEmployee(myGI);//TODO: arthurportas missing work
        myManager.setEmployee(myTW);//TODO: arthurportas missing work
        myManager.displayInformation();
    }
}

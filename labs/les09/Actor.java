/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class Actor {
    public int actorID = 0;
    public String firstName = "-required-";
    public String lastName = "-required-";

    // Method to display Actor field values
    public void displayInformation() {
        System.out.println("Actor ID: " + actorID);
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
    } // end of method
}  // end of class




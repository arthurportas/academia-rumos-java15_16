/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Utilizador
 */
public class Actor {
    public int actorID = 0;
    public String firstName = "-required-";
    public String lastName = "-required-";
    
    public void displayInformation(){
        System.out.println("Actor ID: " + actorID);
        System.out.println("FirstName:" + firstName);
        System.out.println("LastName:" + lastName);
    }
}

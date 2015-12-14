/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Utilizador
 */
public class ActorGetterSetter {
    
    private int actorID;
    private String firstName;
    private String lastName;

    @Override
    public String toString() {
        return "ActorGetterSetter{" + "actorID=" + actorID + ", firstName=" + firstName + ", lastName=" + lastName + '}';
    }
    
    //---------------GETTER/SETTER
    
    public int getActorID() {
        return actorID;
    }

    public void setActorID(int actorID) {
        this.actorID = actorID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.holywood.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 *
 * @author Utilizador
 */
public class Actor {
    
    private int actorID = 0;
    private String firstName = "-required-";
    private String lastName = "-required-";

    //Default NetBeans
    @Override
    public String toString() {
        return "Actor{" + "actorID=" + actorID + ", firstName=" + firstName + ", lastName=" + lastName + '}';
    }

    
    //Apache commons lang3
//    @Override
//    public String toString() {
//        
//        return ToStringBuilder.reflectionToString(this);
//    }
    
    

    /**
     * @return the actorID
     */
    public int getActorID() {
        return actorID;
    }

    /**
     * @param actorID the actorID to set
     */
    public void setActorID(int actorID) {
        this.actorID = actorID;
    }

    /**
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    
}

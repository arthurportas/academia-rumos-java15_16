/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistence;

/**
 *
 * @author Utilizador
 */
public enum PersistenceType {
    
    IN_MEMORY( (short)1, "memory", "In Memory");
    
    private short value;
    private String shortDescription;
    private String longDescritption;

    private PersistenceType(short value, String shortDescription, String longDescritption) {
        this.value = value;
        this.shortDescription = shortDescription;
        this.longDescritption = longDescritption;
    }

    public short getValue() {
        return value;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public String getLongDescritption() {
        return longDescritption;
    }

}

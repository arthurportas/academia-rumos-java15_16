/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Utilizador
 */
class ActorStringBuilder {

    StringBuilder nameSB = new StringBuilder(8);
    StringBuilder  phone = new StringBuilder();
    
    void displayActorInfo() {
        nameSB.append("arthur")
                .append(" ")
                .append("marques")
                .append(" ")
                .append("portas");
        System.out.println("------------BEFORE toString()------");
        System.out.println("name: " + nameSB);
        System.out.println("------------AFTER toString()------");
        System.out.println("name: " + nameSB.toString());
        System.out.println("------------CAPACITY------");
        System.out.println("capacity: " + nameSB.length());
        
        System.out.println("------------PHONE------");
        phone.append("5551234567");
        phone.insert(3, "-");
        System.out.println("phone: " + phone);
        
        String phoneNumberAsString = phone.toString();
        System.out.println("phoneNumberAsString: " + phoneNumberAsString);  
        
        String fullName = nameSB.toString();
        String firstName = fullName.substring(0, fullName.indexOf(" "));
        System.out.println("fullName: " + fullName);
        System.out.println("firstName: " + firstName);
    }
    
}

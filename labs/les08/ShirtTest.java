/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Utilizador
 */
public class ShirtTest {
        public static void main (String[] args) {
        Shirt myGenericShirt = new Shirt();
        myGenericShirt.desc = "plain white";
        System.out.println("Shirt color: " + myGenericShirt.colorCode);      
        myGenericShirt.changeShirtColor(myGenericShirt, 'B');
        System.out.println("Shirt color: " + myGenericShirt.colorCode);
        
        Shirt myStampedShirt = new Shirt();
        myStampedShirt.desc = "stamped";
       // myStampedShirt.changeShirtColor(myStampedShirt, 'G');
        myStampedShirt.changeShirtColor('G');
        System.out.println("Shirt color: " + myStampedShirt.colorCode);
    }
////    public static void changeShirtColor(Shirt theShirt, char color) {
////        theShirt.colorCode = color;
////    }

}

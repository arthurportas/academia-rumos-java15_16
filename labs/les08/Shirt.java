/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Utilizador
 */
class Shirt {
    
    String desc = "----";
    char colorCode = 'W';
    
    public void changeShirtColor(Shirt theShirt, char color){
        theShirt.colorCode = color;
    }
    public void changeShirtColor(char color){
        this.colorCode = color;
    }
}

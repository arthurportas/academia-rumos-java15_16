/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Utilizador
 */
public class Rectangle {

    int width;
    int height;

    //no args constructor
    public Rectangle() {
        width = 25;
        height = 10;
        System.out.println("Default rectangle created: width = 25, height = 10");
    }

    public Rectangle(int w, int h) {
        //validating the argument values h and w should be > 0 and < 30
        if( w > 0 && h > 0 && w < 30 && h < 30) {
            this.width = w;
            this.height = h;
        }else {
            System.out.println("INPUT ERROR! PLEASE CHECK FOLLOWING CONDITIONS:");
            System.out.println("Values height and weight should be > 0 and < 30");
        }
    }

    //that calculates and returns the area of the rectangle
    public int getArea(){
        return width * height;
    }
    
    public void draw(){
        
        //The outer for loop iterates through the rows of the rectangle. The number of rows
        //corresponds to the value of the height field.

        for (int rows = 0; rows < height; rows++) {
        //The inner for loop iterates through the columns of each row. The number of columns
        //corresponds to the value of the width field.

            for (int columns = 0; columns < width; columns++) {
                //logic to skip
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}

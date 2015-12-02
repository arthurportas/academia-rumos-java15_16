/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Utilizador
 */
public class ActorTest {
    
    public static void main(String[] args) {
        
        Actor actor1 = new Actor();
        actor1.actorID = 99;
        actor1.firstName = "Arthur Portas";
        
        Actor actor2= new Actor();
        actor2.actorID = 100;
        actor2.firstName = "Rita";
        
        actor1.displayInformation();
        actor2.displayInformation();
    }
}

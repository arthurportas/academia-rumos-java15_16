/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */

public class ActorPublicTest {
  public static void main(String args[]) {
    ActorPublic actor = new ActorPublic();
    actor.actorID = 16;
    actor.firstName = "John";
    actor.lastName = "Doe";
    
    System.out.println("Actor: "+ actor.actorID+ "/" +actor.firstName  
          + "/" + actor.lastName);
  }// end main

} // end class


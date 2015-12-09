

public class ActorGetterSetterTest {
  public static void main(String args[]){
      ActorGetterSetter actor = new ActorGetterSetter();
      actor.setActorID(10);
      actor.setFirstName("Mike");
      actor.setLastName("Tango");
      
      System.out.println("Actor: "+ actor.getActorID()+ "/" +actor.getFirstName()
          + "/" + actor.getLastName());

        
  } // end main
} // end class

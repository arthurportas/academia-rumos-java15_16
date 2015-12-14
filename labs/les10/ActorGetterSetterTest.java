
public class ActorGetterSetterTest {

    public static void main(String args[]) {

        ActorGetterSetter actor = new ActorGetterSetter();

        actor.setActorID(10);
        actor.setFirstName("Mike");
        actor.setLastName("Tango");
        
        System.out.println( actor.toString() );
    } // end main
} // end class

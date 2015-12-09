
import java.util.ArrayList;


public class ActorsList {
    public ArrayList listOfActors;
    
    public void setList(){
        listOfActors = new ArrayList();
        listOfActors.add("Joe Smith");
        listOfActors.add("Mary Palmer");
        listOfActors.add("Jose Gonzalez");
        listOfActors.add("Linda Baker");
        
        System.out.println("Names List: " + listOfActors);
        System.out.println("Size of ArrayList: " + listOfActors.size());
    }
    
    public void manipulateList(){
        listOfActors.remove("Joe Smith");
        System.out.println ("Names list after removing element: " + listOfActors);
        System.out.println ("Size of ArrayList: " + listOfActors.size());
        listOfActors.add(1, "Joe Smith");
        System.out.println ("Names list after adding element: " + listOfActors);
        System.out.println ("Size of ArrayList: " + listOfActors.size());
    }
}

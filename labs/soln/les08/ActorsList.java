import java.util.ArrayList;

public class ActorsList {
    public ArrayList listOfActors;
    
    public void setList(){
        listOfActors = new ArrayList();
        listOfActors.add("Joe Smith");
        listOfActors.add("Mary Palmer");
        listOfActors.add("Jose Gonzalez");
        listOfActors.add("Linda Baker");
        System.out.println("Size of ArrayList is: " + listOfActors.size());
    }
    
    public void displayNames(){
        System.out.println("Actors in the ArrayList: ");
        for(Object actor : listOfActors){
            System.out.println(actor);
        }
    }       
}

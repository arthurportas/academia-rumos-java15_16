
import java.util.ArrayList;

public class ActorsList {
    
    public ArrayList<String> listOfActors;
    
    public void setList(){
        listOfActors = new ArrayList();
        listOfActors.add("Joe Smith");
        listOfActors.add("Mary Palmer");
        listOfActors.add("Jose Gonzalez");
        listOfActors.add("Linda Baker");
        System.out.println("Size of ArrayList is: " + listOfActors.size());
    }
       
    void displayNames(){
        for (String nameOfActorInList : listOfActors) {
            System.out.println("Name: " + nameOfActorInList);
        }
    }
}

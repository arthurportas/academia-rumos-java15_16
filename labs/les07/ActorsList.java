
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Utilizador
 */
public class ActorsList {
 
    ArrayList<String> listOfActors;
    
    public void setList(){
        listOfActors = new ArrayList<String>();
        listOfActors.add("Joe Smith");
        listOfActors.add("Arthur Portas");
        listOfActors.add("João Soares");
        listOfActors.add("José Soares");
        print();
    }

    private void print() {
        System.out.println("Names list:" + listOfActors);
        System.out.println("Names list(size):" + listOfActors.size());
        
    }

    void manipulateList() {
        
        String objectToMAnipulate = "Joe Smith";
        listOfActors.remove(objectToMAnipulate);
        print();
        listOfActors.add( listOfActors.size(), objectToMAnipulate );
        print();
    }
}

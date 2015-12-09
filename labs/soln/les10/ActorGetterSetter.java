
public class ActorGetterSetter {

    private int actorID = 0;
    private String firstName = "-required-";
    private String lastName = "-required-";

    public void displayDate() {
        if (actorID == 0 ) {
            System.out.println("Invalid actor.");
        } else {
            System.out.println("Actor: "+ actorID+ "/" +firstName  
          + "/" + lastName);
        }
    }

    public int getActorID() {
        return actorID;
    }

    public void setActorID(int actorID) {
        this.actorID = actorID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}

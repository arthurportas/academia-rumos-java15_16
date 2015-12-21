
import java.util.*;

/**
 * @author Arthur Portas
 */
public class Editor extends SkilledEmployee implements Printable{

    /**
     * Default constructor
     */
    public Editor() {
    }

    /**
     * 
     */
    private boolean prefersPaperEditing;

    /**
     * 
     */
    public void displayInformation() {
           //System.out.println(super.toString());
        super.displayInformation();
        
        System.out.println("Editing preference in: " + getEditingPreference());
    }

    void setPrefersPaperEditing(boolean preference) {
        this.prefersPaperEditing = preference;
    }

    public String getEditingPreference(){
        return prefersPaperEditing ? "Paper" : "Electronic";
    }
}
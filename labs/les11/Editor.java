
import java.util.*;

/**
 * @author Arthur Portas
 */
public class Editor extends SkilledEmployee {

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
    }

    void setPrefersPaperEditing(boolean preference) {
        this.prefersPaperEditing = preference;
    }

}
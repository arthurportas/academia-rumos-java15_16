
import java.util.*;

/**
 * @author Arthur Portas
 */
public class SkilledEmployee extends Employee {

    /**
     * Default constructor
     */
    public SkilledEmployee() {
    }

    /**
     * 
     */
    private String[] skillList;

    /**
     * 
     */
    public void displayInformation() {
        // TODO implement here
    }

    public String[] getSkillList() {
        return skillList;
    }

    public void setSkillList(String[] skillList) {
        this.skillList = skillList;
    }

    void setSkill(String skill) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
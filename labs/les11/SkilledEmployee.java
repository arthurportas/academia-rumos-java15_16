
import java.util.*;

/**
 * @author Arthur Portas
 */
public class SkilledEmployee extends Employee implements Printable{

    /**
     * Default constructor
     */
    public SkilledEmployee() {
        //skillList = new ArrayList<String>();
    }

    /**
     * 
     */
    private List<String> skillList = new ArrayList<String>();

    /**
     * 
     */
    public void displayInformation() {
        super.displayInformation();
        
        System.out.println("Manager has the following employees: ");
        
//        for (int i = 0; i < skillList.size(); i++) {
//            System.out.println(skillList.get(i));
//        }
        for (int i = 1; i <= skillList.size(); i++) {
            System.out.println(skillList.get(i-1));
        }
        
        System.out.println(toString());
    }

    public List<String> getSkillList() {
        return skillList;
    }

    public void setSkillList(List<String> skillList) {
        this.skillList = skillList;
    }

    void setSkill(String skill) {
        this.skillList.add(skill);
    }

    @Override
    public String toString() {
        return "SkilledEmployee{" + "skillList=" + skillList + '}';
    }
   
}
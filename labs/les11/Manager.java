
import java.util.*;

/**
 * @author Arthur Portas
 */
public class Manager extends Employee {

    /**
     * Default constructor
     */
    public Manager() {
        employeeList = new ArrayList<>();
    }

    /**
     * 
     */
    public List<Employee> employeeList;

    /**
     * 
     */
    public void displayInformation() {
        // TODO implement here
    }

    void setEmployee(SkilledEmployee skilledEmployee) {
        if( null != skilledEmployee) {
            this.employeeList.add(skilledEmployee);
        }
    }

}
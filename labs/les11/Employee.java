

/**
 * @author Arthur Portas
 */
public class Employee {

    /**
     * Default constructor
     */
    public Employee() {
    }

    /**
     * 
     */
    private String name;

    /**
     * 
     */
    private String jobTitle;

    /**
     * 
     */
    private int employeeId;

    /**
     * 
     */
    private int level;

    /**
     * 
     */
    public void displayInformation() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Employee{" + "name=" + name + ", jobTitle=" + jobTitle + ", employeeId=" + employeeId + ", level=" + level + '}';
    }
    
    /**
     * 
     */
    public void calculateEmployeeId() {
        // TODO implement here
    }

    //----------------GETTER/SETTERS
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

}
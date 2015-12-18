
import java.util.*;

/**
 * @author Arthur Portas
 */
public class Manager extends Employee {

    private String myCarBrand;//currently not printed
    
    /**
     * Default constructor
     */
    public Manager() {
        employeeList = new ArrayList<>();
    }

    /**
     * 
     */
    public List<Object> employeeList;

    /**
     * 
     */
    public void displayInformation() {
        
        super.displayInformation();
    //Info das propriedades do Manager(instancia), através da super classe Employee
        
        
        System.out.println("Manager has the following employees: ");
        
        Employee tmp;
        for (Object employeeInList : employeeList) {
            tmp = (Employee)employeeInList;
            System.out.println( tmp.getName() );
           // System.out.println( ((Employee) employeeInList).getName() );
        }
    }

    void setEmployee(SkilledEmployee skilledEmployee) {
        if( null != skilledEmployee) {
            this.employeeList.add(skilledEmployee);
        }
    }
    
    public Employee findById(int id) throws Exception{
        
//        if(id > 3) {
//            throw new Exception("ID inválido");
//        }
        Employee tmp;
        for (Object employeeInList : employeeList) {
             tmp = (Employee)employeeInList;
             if(tmp.getEmployeeId() == id){
                 return tmp;
             }
        }
        System.out.println("ERRO: id: " + id + " não existe");
        return null;
        
    }
    
     public Employee findById2(int id) throws EmployeeNotFoundException, Exception{
        
        //third party api call--throw Exception
         
         
        if(id > 3) {
            throw new EmployeeNotFoundException("ID inválido");
        }
        Employee tmp;
        for (Object employeeInList : employeeList) {
             tmp = (Employee)employeeInList;
             if(tmp.getEmployeeId() == id){
                 return tmp;
             }
        }
        System.out.println("ERRO: id: " + id + " não existe");
        return null;
        
    }

}
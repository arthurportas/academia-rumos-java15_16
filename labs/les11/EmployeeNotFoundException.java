/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Utilizador
 */
public class EmployeeNotFoundException extends Exception{

    private String ipOrigin;
    
    public EmployeeNotFoundException(String message) {
        super(message);
    } 
    
    public EmployeeNotFoundException(String message, String ipOrigin) {
        super(message);
        this.ipOrigin = ipOrigin;
    } 
}

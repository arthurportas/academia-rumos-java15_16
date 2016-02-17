package persistence;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import domain.Employee;
import domain.Job;
import domain.Manager;

public class EmployeeDAO {

	private static final String LIST_ALL_EMP = "select * from employee";
	
	public static List<Employee> list(){
		
		List<Employee> employees = new ArrayList<Employee>();
		DBHelper dbHelper = new DBHelper();
		try {
			ResultSet resultSet = dbHelper.executeStatement(LIST_ALL_EMP);
			//iterar rs
			//build list
			while (resultSet.next()) {
				// It is possible to get the columns via name
				// also possible to get the columns via the column number
				// which starts at 1
				// e.g. resultSet.getSTring(2);
				int id = resultSet.getInt("id");
				String firstName = resultSet.getString("first_name");
				String lastName = resultSet.getString("last_name");
				String jobName = resultSet.getString("job_name");
				String jobKeyResp = resultSet.getString("job_key_resp");
				
				//new instances
				Employee emp = new Manager();
				emp.setId(id);
				emp.setFirstName(firstName);
				emp.setLastName(lastName);
				employees.add(emp);
				Job job = new Job();
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return employees;
		
	}
}

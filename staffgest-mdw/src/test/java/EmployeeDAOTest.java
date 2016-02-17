import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import persistence.EmployeeDAO;

public class EmployeeDAOTest {

	@Test
	public void testEmployeesList() {
		Assert.assertTrue(EmployeeDAO.list().size() == 2);
	}

}

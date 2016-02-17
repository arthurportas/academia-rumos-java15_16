import static org.junit.Assert.*;

import org.junit.Test;

import persistence.DBHelper;

public class DatabaseConnectionTest {

	@Test
	public void test() throws Exception {
		DBHelper dbHelper = new DBHelper();
		dbHelper.readDataBase();
	}

}

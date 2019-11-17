package UM.kaloshyna.nure.db;

import java.util.Date;

import org.dbunit.DatabaseTestCase;
import org.dbunit.database.DatabaseConnection;
import org.dbunit.database.IDatabaseConnection;
import org.dbunit.dataset.IDataSet;
import org.dbunit.dataset.xml.XmlDataSet;


import UM.kaloshyna.nure.User;
import junit.framework.TestCase;

public class HsqldbUserDaoTest extends DatabaseTestCase {
	
	private HsqldbUserDao dao;
	private ConnectionFactory connectionFactory;
	
	
	@Override
	protected void setUp() throws Exception {
		super.setUp();
		dao = new HsqldbUserDao (connectionFactory);
	}


	public void testCreate() {
		try {
			
			User user = new User();
			user.setFirstName("Daryna");
			user.setLastName("Kaloshyna");
			user.setDateOfBirth(new Date());
			assertNull(user.getId());
			user = dao.create(user);
			assertNotNull(user);
			assertNotNull(user.getId());
		} catch (DatabaseException e) {
			e.printStackTrace();
			fail(e.toString());
		}
		
	}
	
	public void testFindAll() {
		try {
			java.util.Collection collection = dao.findAll();
            assertNotNull(collection);
            assertEquals(2, collection.size());
		} catch (DatabaseException e) {
			e.printStackTrace();
			fail(e.toString());
		}
	}


	@Override
	protected IDatabaseConnection getConnection() throws Exception {
		connectionFactory = new ConnectionFactoryImpl();
		return new DatabaseConnection(connectionFactory.createConnection());
	}


	@Override
	protected IDataSet getDataSet() throws Exception {
		IDataSet dataSet = new XmlDataSet(getClass().getClassLoader().getResourceAsStream("usersDataSet.xml"));
		return dataSet;
	}

}

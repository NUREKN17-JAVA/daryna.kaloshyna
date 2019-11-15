package UM.kaloshyna.nure.db;

import java.util.Date;

import UM.kaloshyna.nure.User;
import junit.framework.TestCase;

public class HsqldbUserDaoTest extends TestCase {
	
	private HsqldbUserDao dao;
	private ConnectionFactory connectionFactory;
	
	
	@Override
	protected void setUp() throws Exception {
		super.setUp();
		connectionFactory = new ConnectionFactoryImpl();
		dao = new HsqldbUserDao (connectionFactory);
	}


	public void testCreate() {
		try {
			fail("Not yet implemented");
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

}

package UM.kaloshyna.nure.db;

import UM.kaloshyna.nure.db.DaoFactory;
import UM.kaloshyna.nure.db.UserDao;
import junit.framework.TestCase;

public class DaoFactoryTest extends TestCase {

	protected void setUp() throws Exception {
		super.setUp();
	}

	public void testGetUserDao() {
		try {
			DaoFactory daoFactory = DaoFactory.getInstance();
			assertNotNull("DaoFactory instance is null", daoFactory);
			UserDao userDao = daoFactory.getUserDao();
			assertNotNull("UserDao instance is null", userDao);
		} catch (RuntimeException e) {
			e.printStackTrace();
			fail(e.toString());
		}
	}
}
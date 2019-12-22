package UM.kaloshyna.nure.db;

import com.mockobjects.dynamic.Mock;

import UM.kaloshyna.nure.db.DaoFactory;
import UM.kaloshyna.nure.db.UserDao;

public class MockDaoFactory extends DaoFactory {
	
	private Mock mockUserDao;
	
	public MockDaoFactory() {
		mockUserDao = new Mock(UserDao.class);
	}
	
	public Mock getMockUserDao() {
		return mockUserDao;
	}
	
	@Override
	public UserDao getUserDao() {
		return (UserDao) mockUserDao.proxy();
	}

}

package UM.kaloshyna.nure.db;

import java.util.Collection;

import UM.kaloshyna.nure.User;

public interface UserDao {
	User create (User user) throws DatabaseException;
	
	void update (User user) throws DatabaseException;
	
	void delete (User user) throws DatabaseException;
	
	User find(Long id) throws DatabaseException;
	
	Collection findAll() throws DatabaseException;
}
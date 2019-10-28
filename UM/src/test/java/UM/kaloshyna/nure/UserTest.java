package UM.kaloshyna.nure;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import UM.kaloshyna.nure.User;

import java.util.Calendar;
import java.util.Date;

import junit.framework.TestCase;

public class UserTest extends TestCase {


	private static final int YEAR = Calendar.YEAR - 2000;
	private static final int DAY_OF_MONTH = 9;
	private User user;
	private Date dateOfBirth;
	protected void setUp() throws Exception {
		super.setUp();
		user = new User();
		
		Calendar calendar = Calendar.getInstance();
		calendar.set(YEAR, Calendar.SEPTEMBER, DAY_OF_MONTH);
		dateOfBirth = calendar.getTime();
	}
	public void testGetFullName()
	{
		user.setFirstName("Daryna");
		user.setLastName("Kaloshyna");
		assertEquals("Kaloshyna, Daryna", user.getFullName());
	}
	public void testGetAge()

	{
		user.setDateOfBirth(dateOfBirth);
		assertEquals(19, user.getAge());
	}
	public void testGetFullInformation()
	{
		user.setFirstName("Daryna");
		user.setLastName("Kaloshyna");
		user.setEmail("Daryna@gmail.com");
		user.setPhone("+380123123123");
		user.setContry("Ukraine");
		user.setAdress("Kharkiv.X.X");
		assertEquals("Daryna, Kaloshyna Ukraine Kharkiv.X.X +380123123123, Daryna@gmail.com", user.getFullInformation());
	}
	public void  testGetContact()
	{
		user.setFirstName("Daryna");
		user.setLastName("Kaloshyna");
		user.setPhone("+380123123123");
		user.setEmail("Daryna@gmail.com");
		assertEquals("Daryna, Kaloshyna +380123123123, Daryna@gmail.com", user.getContact());
	}
}

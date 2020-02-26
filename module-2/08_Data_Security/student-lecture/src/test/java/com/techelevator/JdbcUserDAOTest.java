package com.techelevator;

import org.junit.Before;

import org.junit.Test;
import org.springframework.util.Assert;

import com.techelevator.model.JdbcUserDao;
import com.techelevator.security.PasswordHasher;

public class JdbcUserDAOTest extends DAOIntegrationTest {

	private JdbcUserDao userDao;
	
	@Before
	public void setup() {
		userDao = new JdbcUserDao(getDataSource(), new PasswordHasher());
	}
	@Test
	public void isUsernameandPassword_should_return_true_when_valid() {
	//Arrange
		String userName = "USERNAME";
		String password = "PASSWORD";
		userDao.saveUser(userName, password);
	//Act
		boolean result = userDao.isUsernameAndPasswordValid(userName, password);
	//Assert
		Assert.isTrue(result);
	}
}

package com.anubhav.service;

import com.anubhav.dao.LoginDao;
import com.anubhav.domain.Login;

/**
 * This is a service class which would call the methods in the LoginDao
 * to execute the SQL part of the call stack
 * @author adawer
 *
 */
public class MyBatisService {

	public static void main(String[] args) {
		LoginDao dao = new LoginDao();
		Login login;

		// To get the record from database
		login = dao.getData("anubhavdawer");
		System.out.println(login.getPassword());

		// To insert a new record in the database
		login.setUserId("tom");
		login.setPassword("harry");
		dao.insertLogin(login);

		// To update new record in the database
		login.setUserId("tom");
		login.setPassword("newpassword");
		dao.updateLogin(login);

		// To delete the existing record
		dao.deleteLogin("tom");

	}
}

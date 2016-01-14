package com.anubhav.dao;

import org.apache.ibatis.session.SqlSession;

import com.anubhav.domain.Login;
import com.anubhav.mappers.LoginMapper;
import com.anubhav.utilities.Util;

public class LoginDao {

	public Login getData(String userId){
	SqlSession session=Util.getSqlSessionFactory().openSession();
	LoginMapper loginMapper=session.getMapper(LoginMapper.class);
	Login login=loginMapper.selectLogin(userId);
	session.close();
	return login;
	}
	
	public void insertLogin(Login login){
		
		SqlSession session=Util.getSqlSessionFactory().openSession();
		LoginMapper mapper=session.getMapper(LoginMapper.class);
		 mapper.insertLogin(login);
		 session.commit();
		 session.close();
		
	}
	
	public void updateLogin(Login login){
		SqlSession session=Util.getSqlSessionFactory().openSession();
		LoginMapper mapper=session.getMapper(LoginMapper.class);
		mapper.updateLogin(login);
		session.commit();
		session.close();
	}
	
	public void deleteLogin(String userId){
		SqlSession session=Util.getSqlSessionFactory().openSession();
		LoginMapper mapper=session.getMapper(LoginMapper.class);
		mapper.deleteLogin(userId);
		session.commit();
		session.close();
	}

}

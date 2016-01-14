package com.anubhav.mappers;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.anubhav.domain.Login;

public interface LoginMapper {

	@Results({
		@Result(property="userId", column="userId"),
		@Result(property="password", column="password")
	})
	@Select("Select userId,password from Login where userId=#{userId}")
	Login selectLogin(String userId);
	
	@Insert("insert into login(userId,password) values(#{userId},#{password})")
	void insertLogin(Login login);
	
	@Update("update login set password=#{password} where userId=#{userId}")
	void updateLogin(Login login);
	
	@Delete("Delete from login where userId=#{}userId")
	void deleteLogin(String userId);
}

package com.crbs.repository;

public class UserSQLquery {

	//회원가입
	public static final String INSERT_USER = "insert into CUSTOMER (id, name, password, isadmin ,phonenumber) values (?,?,?,?,?)";

	//회원탈퇴
	public static final String DELETE_USER = "delete from CUSTOMER where id = ?"; 
		
	//회원정보 수정
	public static final String UPDATE_USER = "update CUSTOMER set phonenumber = ? where id = ?"; 
	
}
package com.testweb.usr.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.jsp.PageContext;
import javax.sql.DataSource;

public class UsrDAO {
	
	private static UsrDAO instance = new UsrDAO();
	
	public UsrDAO() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (Exception e) {
			System.out.println("호출 에러");
		}
		
		
	}
	public static UsrDAO getInstance() {
		return instance;
	}

	private DataSource ds;
	
	private Connection conn = null;
	private PreparedStatement pstmt = null;
	private ResultSet rs = null;
	
	
	
}



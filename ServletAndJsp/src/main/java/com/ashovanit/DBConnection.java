package com.ashovanit;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DBConnection {

	
	public static void getConnection(String name,String email,long mobile,String college,String city,
			String userid,String password){
		
		String url ="jdbc:mysql://localhost:3306/asbovanit";
		String userid1 ="root";
		String password1="1234";
		String query ="insert into userreg1 values(?,?,?,?,?,?,?)";
		String Driver = "com.mysql.cj.jdbc.Driver";
		
		
		try {
			Class.forName(Driver);
			Connection connection = DriverManager.getConnection(url,userid1,password1);
			
			PreparedStatement ps = connection.prepareStatement(query);
			
			ps.setString(1, name);
			ps.setString(2, email);
			ps.setLong(3, mobile);
			ps.setString(4, college);
			ps.setString(5, city);
			ps.setString(6, userid);
			ps.setString(7, password);
		
			
			
			int i = ps.executeUpdate();
			
			if(i<0) {
				System.out.println("data not inserted");
			}
			else {
				System.out.println("data inserted");
			}
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

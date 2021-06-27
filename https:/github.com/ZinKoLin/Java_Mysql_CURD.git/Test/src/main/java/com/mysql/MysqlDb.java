package com.mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MysqlDb {
	
	private Connection con;
	
	public void init() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Class found!");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String url ="jdbc:mysql://localhost:3306/apple";
		String name="root";
		String password="zkl123zkl";
		
		
		try {
			con = DriverManager.getConnection(url, name, password);
			System.out.println("connection successful");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	public Connection getConnection() {
		return con;
	}
	
	
	public void insertPerson(Person prn) {
		
		String sql = "insert into person (name, age) values (?,?)";
		try {
			PreparedStatement prest = con.prepareStatement(sql);
			prest.setString(1, prn.getName());
			prest.setInt(2,prn.getAge() );
			
			int rowCount = prest.executeUpdate();
			if (rowCount>0) {
				System.out.println("successful");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void getAllPeople() {
		
		String sql = "select * from person";
		
		try {
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);
			
			Person p = new Person();
			
			while(rs.next()) {
				
				p.setId(rs.getInt(1));
				p.setName(rs.getString(2));
				p.setAge(rs.getInt(3));
				
				System.out.println(p.getId()+" -> "+p.getName()+" -> "+p.getAge());
				
			}
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void updateByPersonId(int id, Person prn) {
		
		String sql = "update person set name=?, age=? where id=?";
		try {
			PreparedStatement prest = con.prepareStatement(sql);
			prest.setString(1, prn.getName());
			prest.setInt(2,prn.getAge() );
			prest.setInt(3, id);
			
			int rowUpdate = prest.executeUpdate();
			if (rowUpdate>0) {
				System.out.println("Updated successful");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void DeletebyPersonId(int id) {
		
		String sql = "delete from person where id=?";
		try {
			PreparedStatement prest = con.prepareStatement(sql);
			prest.setInt(1, id);
			
			int rowDelete = prest.executeUpdate();
			if (rowDelete>0) {
				System.out.println("Deleted successful");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}

package com.mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MysqlDb mysq = new MysqlDb();
		mysq.init();
		
		Connection con= mysq.getConnection();
		
		
	/*	Person pr = new Person();
		pr.setName("Ei Ei Htwe");
		pr.setAge(24);
		
		//mysq.insertPerson(pr);   //insert
		
		
		mysq.getAllPeople(); //retrive
		
		
		mysq.updateByPersonId(2, pr); //update
		
		*/
		
		mysq.DeletebyPersonId(3); //delete
		mysq.getAllPeople();
		
		

	}

}

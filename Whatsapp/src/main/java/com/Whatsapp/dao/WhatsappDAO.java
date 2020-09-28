package com.Whatsapp.dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import com.Whatsapp.entity.whatsappuser;
public class WhatsappDAO implements WhatsappDAOInterface{
public void deleteprofileDAO() {
		
	}
	public int createprofileDAO(whatsappuser wu) throws Exception {
		int i=0;
		
		//step1 load driver
				Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
				//for oracle
				//Class.forName("oracle.jdbc.driver.OracleDriver");
				//for sql
				//Class.forName("com.mysql.jdbc.Driver");
				
				//step2Create connection with database
				Connection con=DriverManager.getConnection("jdbc:derby:F:/myfirstdb;create=true","laptop","laptop");
				//step3 create query
				PreparedStatement ps=con.prepareStatement("insert into detailw values(?,?,?,?)");//? represents that we are going to take values for questions
				ps.setString(1, wu.getName());//1 means pehla ? and = pehle column ki value
				
				ps.setString(2, wu.getAddress());
				
				ps.setString(3, wu.getEmail());
				
				ps.setString(4,wu.getPassword());
				
				//step4 executeQuery
				i=ps.executeUpdate();
				
		
		return i;
		
	}
	public void viewprofileDAO() {
		
	}
	
	public void updateprofileDAO() {
		
	}
	public void findprofileDAO() {
		
	}
	public void activeprofileDAO() {
		
	}

	

}

package org.tnsindia.springbean;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StudentDAO {

	private String driver;
	private String URL;
	private String username;
	private String password;
	
	
	
	public void setDriver(String driver) {
		this.driver = driver;
	}



	public void setURL(String uRL) {
		URL = uRL;
	}



	public void setUsername(String username) {
		this.username = username;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	public void selectAllRows() throws ClassNotFoundException, SQLException
	{
		Class.forName(driver);
		
		Connection c=DriverManager.getConnection(URL, username, password);
		
		Statement s=c.createStatement();
		ResultSet r=s.executeQuery("SELECT * FROM m25.customer;");
		
		while(r.next())
		{
			int cust_ID=r.getInt(1);
			String Name=r.getString(2);
			double product_price=r.getDouble(3);
			System.out.println("The below table is for customer");
			System.out.println("Customer ID: "+cust_ID+" "+"Customer Name: "+Name+" "+"Product Price: "+product_price);
		}
	}
	
}

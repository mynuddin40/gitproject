package com.sohel.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DataBaseConnectivity {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class obj=Class.forName("com.mysql.jdbc.Driver");
		System.out.println(obj.getClass());
		Connection connect=DriverManager.getConnection("jdbc:mysql://localhost:3306/firstproject","root","root");
		System.out.println(connect);
		
		String sst=("Create Table Customer1(cid int(20),cname varchar(30))");
		String insertTable=("insert into Customer1 values(124,'chotu')");
		Statement st=connect.createStatement();
		boolean status=st.execute(insertTable);
		System.out.println(status);
		connect.close();
	}
}

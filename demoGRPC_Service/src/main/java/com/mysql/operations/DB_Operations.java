package com.mysql.operations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DB_Operations {
	
	private Connection connection;
	
	public DB_Operations() {
			try {
				connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sakila", "root", "password");
			} catch (SQLException e) {
				e.printStackTrace();
			}

	}

	public int insertInDB(int id, String label) {
		
		System.out.println("inside   insertDB method");
		String insertQuery = "insert into test_table(id, label) values(?,?)";
		
		int rowsAffected = 0;
		
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);
			
			preparedStatement.setInt(1, id);
			preparedStatement.setString(2, label);
			
			rowsAffected = preparedStatement.executeUpdate();
			System.out.println("values inserted");

			preparedStatement.close();
//			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return rowsAffected;
		 
	}
}

package com.sj;

import java.sql.DriverManager;
import java.sql.SQLException;

import java.sql.Connection;

public class DBconnector {
	
		static DBconnector db;
		private void DBConnector() {
			
		}
	
		public static DBconnector getInstance() {
			if(db==null)
				db=new DBconnector();
			return db;
		}
	
		public static Connection getConnection()throws SQLException{
			return (Connection) (DriverManager.getConnection("jdbc:mysql://localhost:3306/schemaone1","root","shilpa1234@"));
			
			
	}

}

/**
 * 
 */
package com.sj;

import java.sql.PreparedStatement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


/**
 * @author skamsani2
 *
 */
public class ProjectDAO {
	
	
	 Connection con;
	 public boolean insertProject(Project p) {
		
		try {
			con=DBconnector.getConnection();
			PreparedStatement ost=prepareStatement("insert into project values(?,?,?,?");
			
			
			ost.setInt(1,p.getId());
			
			ost.setInt(1,p.getId());
			ost.setString(2,p.getTitle());
			ost.setString(3,p.getDescription());
			ost.setString(4,p.getDomain());
			ost.execute();
			return true;
		
	}
		catch(SQLException e) {
			e.printStackTrace();
		}
	
	return false;
	}
	private PreparedStatement prepareStatement(String string) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	
	

}

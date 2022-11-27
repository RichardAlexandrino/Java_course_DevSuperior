package application;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import db.DB;
import db.DbIntegrityException;

public class Program01 {

	public static void main(String[] args) {
	
		Connection conn = null;
		Statement st = null;
		try {
			conn = DB.getConnection();
			
			st = conn.createStatement();
			
			int rows1 = st.executeUpdate(""
					+ "UPDATE seller SET BaseSalary = 2090 WHERE DepartamentId = 1");
			
			int rows2 = st.executeUpdate(""
					+ "UPDATE seller SET BaseSalary = 3090 WHERE DepartamentId = 2");
			
			int x = 1;
			if (x<2) {
				throw new SQLException("Fake error");
			}
			
			System.out.println("rows1 " + rows1);
			System.out.println("rows2 " + rows2);
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			DB.closeStatement(st);
			DB.closeConnection();
		}
	}

}

package javaProgramme.practice;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;

public class JdbcConnectionOracle {
	
	static void showData(String databaseName) throws SQLException
	{
		Connection con=null;
		Statement stmt=null;
		
		try {
			if(databaseName.equals("Oracle"))
			{
				DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
				System.out.println("------Oracle Driver is registered successfully------");
			}else
			{
				DriverManager.registerDriver(new com.mysql.jdbc.Driver());
				System.out.println("------SQL Driver is registered successfully------");
			}
			
		} catch (SQLException e) {
			System.err.println("------Driver is Not registered------");
		}

		try {
			if(databaseName.equals("Oracle"))
			{
				con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","root");
				System.out.println("------Connection With Oracle Database is Established successfully------");
			}else
			{
				con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Nagesh","root","root");
				System.out.println("------Connection With Database is Established successfully------");
			}
			
		} catch (SQLException e) {
			System.err.println("-------Connection With Database is not Established------");
		}
		
		PreparedStatement pr=con.prepareStatement("insert into emp values(?,?)");
		
		pr.setInt(1, 1395);
		pr.setString(2, "Nagesh Mahadev Kadam");
		
		pr.executeUpdate();
		
		System.out.println("Data is updated");
		
		try {
			stmt=con.createStatement();
			System.out.println("------Statement is created successfully------");
		} catch (SQLException e) {
			System.err.println("-------Statement is not created successfully------");
		}
		
		ResultSet rs = null;
		try {
			rs = stmt.executeQuery("select * from emp");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("-----Data from database is as follows------");
		try {
			while(rs.next())
			{
				System.out.println("Id: "+rs.getInt(1)+"\tName: "+rs.getString(2));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		try {
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("-----Connection closed successfully------");
		
		try {
			DriverManager.deregisterDriver(new oracle.jdbc.driver.OracleDriver());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("-----Driver Deregistered successfully------");
		
	}
	
	

}

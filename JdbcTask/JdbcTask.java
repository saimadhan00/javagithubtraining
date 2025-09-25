package JdbcTask;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcTask {

	public static void main(String[] args) throws SQLException {
		
		// 1.Create a Connection
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/madhan", "root","9688317700@Ss");
							
		//2. create statement Query	
							
		 Statement stmt=con.createStatement();
		 String s="INSERT INTO EmployeeTable VALUES(101,'jenny','25','10000')"+"(102, 'Jacky', '30', '20000')," +
		          "(103, 'joe', '20', '40000')," +
		          "(104, 'jhon', '40', '80000')"+
		          "(105, 'shameer', '25', '90000')" ;
					
		//3.execute the statementQuery	
				    		 
		stmt.execute(s) ;
				    		
	    //4.close the connection
				    		
		con.close();
				    		
		System.out.println("Query Executed");

	}

}

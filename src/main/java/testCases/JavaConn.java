package testCases;
import java.sql.*; 

public class JavaConn {

	public static void main(String args[]){  
		try{  
			
			 // tell the driver where to look for the TNSNAMES.ORA file
			System.setProperty(
			          "oracle.net.tns_admin",
			          "C:/app1/rahilshaikh20/product/12.1.0/dbhome_1/network/admin");

			// ORCL is net service name from the TNSNAMES.ORA file
			String dbURL = "jdbc:oracle:thin:@ORCL1";

			// load the driver
			Class.forName("oracle.jdbc.OracleDriver");

			Connection conn = null;
			 conn = DriverManager.getConnection(dbURL,"system", "rahil");	
			
			
		//step3 create the statement object  
		Statement stmt=conn.createStatement();  
		  
		//step4 execute query  
		ResultSet rs=stmt.executeQuery("select * from EMPLOYEES where last_name like '%un%'" );  
		while(rs.next())  
		System.out.println(rs.getString(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  
		  
		//step5 close the connection object  
		conn.close();  
		  
		}catch(Exception e){ System.out.println(e);}  
}
}

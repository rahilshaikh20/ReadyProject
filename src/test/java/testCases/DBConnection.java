package testCases;
import java.sql.*;

public class DBConnection
{ 
	   // JDBC driver name and database URL 
	   static final String JDBC_DRIVER = "org.h2.Driver";   
	   static final String DB_URL = "jdbc:h2:file://C:/Temp/H2/ourDB"; 
	   									
	   
	   //  Database credentials 
	   static final String USER = "sa"; 
	   static final String PASS = ""; 
	  
	   public static void main(String[] args) { 
	      Connection conn = null; 
	      Statement stmt = null; 
	      try { 
	         // STEP 1: Register JDBC driver 
	         Class.forName(JDBC_DRIVER); 
	             
	         //STEP 2: Open a connection 
	         System.out.println("Connecting to database..."); 
	         conn = DriverManager.getConnection(DB_URL,USER,PASS);  
	         
	         //STEP 3: Execute a query 
	         System.out.println("Creating table in given database..."); 
	         stmt = conn.createStatement(); 
	        // String sql =  "CREATE TABLE CHILDREN (id INTEGER not NULL, first VARCHAR(255),last VARCHAR(255),  age INTEGER,PRIMARY KEY ( id ))";  
	  // String sql = "INSERT INTO CHILDREN VALUES ('14', 'Aftab', 'Shaikh', '22')";
	      String sql ="SELECT * FROM CHILDREN";
	         
	    //stmt.executeUpdate(sql);
	   
	       ResultSet rs= stmt.executeQuery(sql);
	         
	         while(rs.next()) { 
	             // Retrieve by column name 
	             int id  = rs.getInt("ID"); 
	            int age = rs.getInt("AGE"); 
	             String first = rs.getString("NAME"); 
	             //String last = rs.getString("last");  
	             
	             // Display values 
	             System.out.print("ID: " + id); 
	             System.out.print(", Age: " + age); 
	             System.out.println(", First: " + first); 
	             
	          } 
	        
	         //
	         
	         // STEP 4: Clean-up environment 
	         stmt.close(); 
	         conn.close(); 
	      } catch(SQLException se) { 
	         //Handle errors for JDBC 
	         se.printStackTrace(); 
	      } catch(Exception e) { 
	         //Handle errors for Class.forName 
	         e.printStackTrace(); 
	      } finally { 
	         //finally block used to close resources 
	         try{ 
	            if(stmt!=null) stmt.close(); 
	         } catch(SQLException se2) { 
	         } // nothing we can do 
	         try { 
	            if(conn!=null) conn.close(); 
	         } catch(SQLException se){ 
	            se.printStackTrace(); 
	         } //end finally try 
	      } //end try 
	      System.out.println("Goodbye!");
	   } 
	}
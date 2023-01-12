package question5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MysqlConncection {
	 Connection myConn = null;
	    Statement myStmt = null;
	    ResultSet myRs = null;

	    public Connection getConnection()  throws SQLException
	    {
	        Connection myinConn = null;
	        try {
	        Class.forName("com.mysql.jdbc.Driver");  
	        myinConn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/demo?characterEncoding=latin1&useConfigs=maxPerformance", "root" , "DataGuard432$");
	        }catch (Exception exc) {
	            exc.printStackTrace();
	        }


	        return myinConn;
	    }

	    public  void getAllGuests()throws SQLException  {

	         myConn  = getConnection();
	            try {
	                MysqlConncection obj = new MysqlConncection();
	                myConn = obj.getConnection();
	               
	                myStmt = myConn.createStatement();

	               
	                myRs = myStmt.executeQuery("select * from employees");

	                
	                while (myRs.next()) {
	                    System.out.println("ID:"+myRs.getString("id") + ", Name : " + myRs.getString("first_name") + ", Email: " + myRs.getString("email"));
	                }
	            }
	            catch (Exception exc) {
	                exc.printStackTrace();
	            }
	            finally {
	                if (myRs != null) {
	                    myRs.close();
	                }

	                if (myStmt != null) {
	                    myStmt.close();
	                }

	                if (myConn != null) {
	                    myConn.close();
	                }
	            }
	    }

	    public  void getAllGuestsByNames()throws SQLException  {

	         myConn  = getConnection();
	            try {
	                MysqlConncection obj = new MysqlConncection();
	                myConn = obj.getConnection();
	               
	                myStmt = myConn.createStatement();

	               
	                myRs = myStmt.executeQuery("select * from employees");

	                
	                while (myRs.next()) {
	                    System.out.println( " Name : " + myRs.getString("first_name") );
	                }
	            }
	            catch (Exception exc) {
	                exc.printStackTrace();
	            }
	            finally {
	                if (myRs != null) {
	                    myRs.close();
	                }

	                if (myStmt != null) {
	                    myStmt.close();
	                }

	                if (myConn != null) {
	                    myConn.close();
	                }
	            }
	    }
	    public static void main(String[] args) throws SQLException  {

	 

	        
	        MysqlConncection obj = new MysqlConncection();
	        obj.getAllGuests();
	        obj.getAllGuestsByNames();
	    }
}

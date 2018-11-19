package sunday0923;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class utilsunday {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		String TABLENAME="usertbl";
		
		int retval=countTableRec(TABLENAME);
		
		System.out.println(retval);;
		
	}
	
	public static  int  countTableRec(String TABLENAME) throws ClassNotFoundException, SQLException 
	 {
         int count=0;
         
	  // try{  
	      //step1 load the driver class  
         Class.forName("oracle.jdbc.driver.OracleDriver");  
		      
	      //step2 create  the connection object  
	      Connection con=DriverManager.getConnection(  
	     "jdbc:oracle:thin:@localhost:1521:orcl","nazmul","nazmul");  
		     
	      //step3 create the statement object  
	      java.sql.Statement stmt=con.createStatement();  
		   // java.sql.Statement stmt1=con.createStatement();  
	      
	      //step4 execute query  
	      ResultSet rs=stmt.executeQuery("select * from "+ TABLENAME);  
			
	      
	      while(rs.next())  {
	      System.out.println(rs.getString(1)+"  "+rs.getString(2));
	      //   + "  === " + rs.getString(3)); 
	        count++;
}
	  // }
	   
	   //catch(Exception ex) {System.out.println("error"); };
	   
	      
	       return count;
	       
	 }

	public static String GetInput(String fILENAME) {
		// TODO Auto-generated method stub
		return null;
	}

	public static boolean ValidateUser(String string, String string2, String string3, String usernm) {
		// TODO Auto-generated method stub
		return false;
	}

	public static void callurl(String usernm) {
		// TODO Auto-generated method stub
		
	}
	
}
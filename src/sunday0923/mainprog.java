package sunday0923;

import java.io.IOException;
import java.sql.SQLException;

public class mainprog {
	public static void main(String[] args) throws IOException, ClassNotFoundException, SQLException, InterruptedException  {
	
		// ==================================================================
		//
		//   1. Get The User from the Input File 
		//   2.  Validate the User with the Database
		//   3.  Invoke URL and Populate userid snd Password and Login and Verify whether  error message Occured
		//   4.  Produce the error Report Based on the Outcome 
		// =======================================================================
		
		
		String FILENAME="C:/class0812/input.dat";
		String Usernm=utilsunday.GetInput(FILENAME);
		System.out.println("user to be tested=" + Usernm );
		
		boolean validate=utilsunday.ValidateUser("nazmul","nazmul","usertbl",Usernm );
		System.out.println("user Status=" + validate );
		
		utilsunday.callurl(Usernm);
		
		
		
}
}


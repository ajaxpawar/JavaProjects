package empMS;
import java.sql.*;
public class ConnServer {
	
	public Connection con;
	public Statement stat;
	public ResultSet result;
	ConnServer(){
		
		try {
			String url="jdbc:mysql://localhost:3306/employeems";
			String userName="root";
			String userPass="";
			//String qu="SELECT EmpDesignation FROM `empdetails` WHERE empname='ajay';";
			//Class.forName("com.mysql.jdbc.Driver");
		    con=DriverManager.getConnection(url,userName,userPass);		
		    stat=con.createStatement();		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
	
	
}

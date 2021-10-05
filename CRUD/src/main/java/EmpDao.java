import java.util.*;
import java.sql.*;
public class EmpDao {
	public static Connection getConnection() {
		Connection con=null;
		try {
			String url="jdbc:mysql://localhost:3306/employeems";
			String userName="root";
			String userPass="";
		    con=DriverManager.getConnection(url,userName,userPass);	
		}
		catch (Exception e) {
			System.out.println(e);
		}
		return con;
	}
	public static void display() {
		try {
			Connection con=EmpDao.getConnection();
			if(con!=null) {
				System.out.println("Connected...");
			}
			else {
				System.out.println("Not Con...");
			}
		}
		catch (Exception e) {
			System.out.println(e);
		}
	}
	public static void main() {
		display();
	}
}

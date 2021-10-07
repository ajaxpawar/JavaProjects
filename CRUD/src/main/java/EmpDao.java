import java.util.*;
import java.sql.*;
public class EmpDao {
	public static Connection getConnection(){
		Connection con=null;
		try {
			String url="jdbc:mysql://localhost:3306/servletdb";
			String userName="root";
			String userPass="";
			Class.forName("com.mysql.jdbc.Driver");
		    con=DriverManager.getConnection(url,userName,userPass);	
		}
		catch (Exception e) {
			System.out.println(e);
			e.printStackTrace();
		}
			return con;
	}
	public static int create(Emp empObj) {
		int status=0;
		try {
			Connection con=EmpDao.getConnection();
			PreparedStatement ps=con.prepareStatement("INSERT INTO `user`(`NAME`, `PASSWORD`, `EMAIL`, `COUNTY`) VALUES (?,?,?,?)");
			ps.setString(1, empObj.getName());
			ps.setString(2, empObj.getPassword());
			ps.setString(3, empObj.getEmail());
			ps.setString(4, empObj.getCountry());

			status=ps.executeUpdate();
			con.close();
			

		}
		catch (Exception e) {
			System.out.println(e);
			e.printStackTrace();
			

		}
		return status;
	}
	//  check Connection
	 public static void display() {
		try {
			Connection con=EmpDao.getConnection();
			System.out.println(con);
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
	public static void main(String args[]) {
		display();
	}
}

package empMS;
import java.sql.*;
import java.util.Scanner;
public class EmployeeService {
	Integer id;
	String name;
	Double salary;
	String designation;
	Scanner scanDetails=new Scanner(System.in);
	void add(){

		
		 System.out.print("Enter Employee Id: ");
         id=scanDetails.nextInt();
       //  System.out.println();
         System.out.print("Enter Employee Name: ");
         name=scanDetails.next();
         //System.out.println();
         System.out.print("Enter Employee Salary: ");
         salary=scanDetails.nextDouble();
         //System.out.println();
         System.out.print("Enter Employee Designation: ");
         designation=scanDetails.next();
		try {
			ConnServer ser=new ConnServer();
			String insertQuary="INSERT INTO `empdetails` (`EmpId`, `EmpName`, `EmpSalary`, `EmpDesignation`) VALUES ('"+id+"', '"+name+"', '"+salary+"', '"+designation+"');";
			ser.stat.executeUpdate(insertQuary);
	        System.out.println( "REcord up");
	        ser.stat.close();
	        ser.con.close();
		}
		catch(Exception ee) {
			System.out.println("Erro: "+ee);
		}
	}
	void display() {
		 System.out.print("Enter Employee Id: ");
         id=scanDetails.nextInt();
         try {
 			ConnServer ser=new ConnServer();
 			String insertQuary="SELECT * FROM `empdetails` WHERE empid="+id+";";
 			ser.result= ser.stat.executeQuery(insertQuary);
 			ser.result.next();
 	        System.out.println("Employee ID : "+ser.result.getInt("EmpId"));
 	        System.out.println("Employee NAME : "+ser.result.getString("EmpName"));
 	        System.out.println("Employee SALARY : "+ser.result.getDouble("EmpSalary"));
 	        System.out.println("Employee DESIGNATION : "+ser.result.getString("EmpDesignation"));

 	        ser.stat.close();
 	        ser.con.close();
 		}
 		catch(Exception ee) {
 			System.out.println("Erro: "+ee);
 		}
	}
	void update() {//problem section
		System.out.print("Enter Employee Id: ");
        id=scanDetails.nextInt();
        try {
			ConnServer ser=new ConnServer();
			String insertQuary="SELECT * FROM `empdetails` WHERE empid="+id+";";
			ser.result= ser.stat.executeQuery(insertQuary);
			ser.result.next();
	        System.out.println("Employee ID : "+ser.result.getInt("EmpId"));
	        System.out.println("Employee NAME : "+ser.result.getString("EmpName"));
	        System.out.println("Employee SALARY : "+ser.result.getDouble("EmpSalary"));
	        System.out.println("Employee DESIGNATION : "+ser.result.getString("EmpDesignation"));
	        System.out.println("++++++++++++++++++++++++++++++++");

	        System.out.println("press 1 for Id udate....");
			System.out.println("press 2 for Name udate....");
			System.out.println("press 3 for Salary udate....");
			System.out.println("press 4 for Designation udate....");
			System.out.print("Enter your uodate choise:  ");
			switch(scanDetails.nextInt()) {
			case 1: 

				 System.out.print("Enter Employee New Id: ");
		         Integer newId=scanDetails.nextInt();
				insertQuary="UPDATE `empdetails` SET `EmpId`='"+newId+"' WHERE EmpId="+id+";";
				ser.stat.executeUpdate(insertQuary);
		        System.out.println("Record Updated....");
		        System.out.println("++++++++++++++++++++++++++++++++");
				break;
			case 2:
				System.out.print("Enter Employee New Name: ");
		         String newName=scanDetails.next();
				insertQuary="UPDATE `empdetails` SET `EmpName`='"+newName+"' WHERE EmpId="+id+";";
				ser.stat.executeUpdate(insertQuary);

		        System.out.println("Record Updated....");
		        System.out.println("++++++++++++++++++++++++++++++++");
				break;
			case 3:
				System.out.print("Enter Employee New Name: ");
		         Double newSalary=scanDetails.nextDouble();
				insertQuary="UPDATE `empdetails` SET `EmpSalary`='"+newSalary+"' WHERE EmpId="+id+";";
				ser.stat.executeUpdate(insertQuary);

		        System.out.println("Record Updated....");
		        System.out.println("++++++++++++++++++++++++++++++++");
				break;
			case 4:
				System.out.print("Enter Employee New Name: ");
		         String newDesignation=scanDetails.next();
				insertQuary="UPDATE `empdetails` SET `EmpDesignation`='"+newDesignation+"' WHERE EmpId="+id+";";
				ser.stat.executeUpdate(insertQuary);

		        System.out.println("Record Updated....");
		        System.out.println("++++++++++++++++++++++++++++++++");
				break;
            default:System.out.println("Envalid Command");
			}

	        

	        ser.stat.close();
	        ser.con.close();
		}
		catch(Exception ee) {
			System.out.println("Erro: "+ee);
		}		
		
		
	}
	void delete() {
		 System.out.print("Enter Employee Id: ");
         id=scanDetails.nextInt();
         try {
 			ConnServer ser=new ConnServer();
 			String insertQuary="SELECT * FROM `empdetails` WHERE empid="+id+";";
 			ser.result= ser.stat.executeQuery(insertQuary);
 			ser.result.next();
 	        System.out.println("Employee ID : "+ser.result.getInt("EmpId"));
 	        System.out.println("Employee NAME : "+ser.result.getString("EmpName"));
 	        System.out.println("Employee SALARY : "+ser.result.getDouble("EmpSalary"));
 	        System.out.println("Employee DESIGNATION : "+ser.result.getString("EmpDesignation"));
			
 	        System.out.println("++++++++++++++++++++++++++++++++");
 	        insertQuary="DELETE FROM `empdetails` WHERE EmpId="+id+";";
 	        ser.stat.executeUpdate(insertQuary);
 	        System.out.println("Record Delete");
 	        System.out.println("++++++++++++++++++++++++++++++++");

 	        ser.stat.close();
 	        ser.con.close();
 		}
 		catch(Exception ee) {
 			System.out.println("Erro: "+ee);
 		}
	}
	
}

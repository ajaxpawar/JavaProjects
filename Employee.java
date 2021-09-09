/**
 * Employee
 */
import java.util.*;
public class Employee {
         String empId;
         String empName;
         double empSalary;
         String empDesignation;
         String delId;
         String updateId;
        ArrayList <Employee>empList=new ArrayList<Employee>();
        void create(){
            Employee empObj=new Employee();
            Scanner scanDetails=new Scanner(System.in);
            System.out.print("Enter Employee Id: ");
            empObj.empId=scanDetails.nextLine();
            System.out.print("Enter Employee Name: ");
            empObj.empName=scanDetails.nextLine();
            System.out.print("Enter Employee Salary: ");
            empObj.empSalary=Float.parseFloat(scanDetails.nextLine());
            System.out.print("Enter Employee Designation: ");
            empObj.empDesignation=scanDetails.nextLine();
            empList.add(empObj); 
        }   
        void update(){
            boolean isDel=false;
            
            System.out.print("Enter Id: ");
            Scanner scanId=new Scanner(System.in);
        
            updateId=scanId.nextLine();
            
            Iterator<Employee> it=empList.iterator();
            while(it.hasNext()){
               if(it.next().empId.equals(updateId)){
                   it.remove();
                     isDel=true;
               }
            }          
            if(isDel){
                create();
                System.out.println("Details Update...");
            }
            else{
                System.out.println("Invalid ID or data not present");
            } 
           
        }   
        void delete(){
            System.out.print("Enter Id: ");
            Scanner scanId=new Scanner(System.in);
            boolean isIdPresent=false;
            delId=scanId.nextLine();
            
            Iterator<Employee> it=empList.iterator();
            while(it.hasNext()){
               if(it.next().empId.equals(delId)){
                   it.remove();
                   isIdPresent=true;
               }
            }          
            if(isIdPresent){
                System.out.println("Deletion complete");
            }
            else{
                System.out.println("Invalid ID or data not present");
            }
        } 
        void show(){
            /**/
            Iterator<Employee> it=empList.iterator();
            while(it.hasNext()){
                it.next().printDetails();
            }          
        }
        void printDetails(){
            System.out.println("---------------------");
            System.out.println(" Employee Id: "+empId);
           
            System.out.println(" Employee Name: "+empName);
           
            System.out.println(" Employee Salary: "+empSalary);
           
            System.out.println(" Employee Designation: "+empDesignation);
            System.out.println("---------------------");
        }
        
    public static void main(String[] args) {
        Employee obj=new Employee();
        int choies; 
        System.out.println("1.Create");
        System.out.println("2.Update");
        System.out.println("3.Delete");
        System.out.println("4.Show");
        System.out.println("5 Exit");
        boolean loop=true;
        while(loop){
        System.out.print("Hello user Enter Your Operation :");
        Scanner scan=new Scanner(System.in);
        choies=scan.nextInt();
       // scan.close();
        switch(choies){
            case 1:obj.create();
            break;
            case 2:obj.update();;
            break;
            case 3:obj.delete();
            break;
            case 4:obj.show();
            break;
            case 5:/*System.out.println("5");*/loop=false;
            break;
            default:System.out.println("Envalid Command");
              
        } 
    }
            
    }
    
}
/*
1.Create
2.Update
3.Delete
4.Show
5 Exit
Hello user Enter Your Operation :1       
Enter Employee Id: a01
Enter Employee Name: ajay
Enter Employee Salary: 1233442
Enter Employee Designation: ceo
Hello user Enter Your Operation :1
Enter Employee Id: a02
Enter Employee Name: sarthak
Enter Employee Salary: 1223343
Enter Employee Designation: manager
Hello user Enter Your Operation :4
---------------------
 Employee Id: a01
 Employee Name: ajay
 Employee Salary: 1233442.0      
 Employee Designation: ceo       
---------------------
---------------------
 Employee Id: a02
 Employee Name: sarthak
 Employee Salary: 1223343.0      
 Employee Designation: manager   
---------------------
Hello user Enter Your Operation :2
Enter Id: a02
Enter Employee Id: a02
Enter Employee Name: raj
Enter Employee Salary: 12345
Enter Employee Designation: maager
Details Update...
Hello user Enter Your Operation :4
---------------------
 Employee Id: a01
 Employee Name: ajay
 Employee Salary: 1233442.0
 Employee Designation: ceo
---------------------
---------------------
 Employee Id: a02
 Employee Name: raj
 Employee Salary: 12345.0
 Employee Designation: maager
---------------------
Hello user Enter Your Operation :3
Enter Id: a00
Invalid ID or data not present
Hello user Enter Your Operation :3  
Enter Id: a02
Deletion complete
Hello user Enter Your Operation :4
---------------------
 Employee Id: a01
 Employee Name: ajay
 Employee Salary: 1233442.0
 Employee Designation: ceo
---------------------
Hello user Enter Your Operation :        
 */
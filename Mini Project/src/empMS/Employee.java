package empMS;

import java.util.Scanner;

public class Employee extends EmployeeService {
	
	Employee(){
		int choies; 
        System.out.println("1.Add Details");
        System.out.println("2.Update");
        System.out.println("3.Delete");
        System.out.println("4.Display");
        System.out.println("5 Exit");
        while(true){
        System.out.print("Hello user Enter Your Operation :");
        Scanner scan=new Scanner(System.in);
        choies=scan.nextInt();
        switch(choies){
            case 1:      add();//System.out.println("1.Add"); 
            break;
            case 2:       update();//System.out.println("2.Update");
            break;
            case 3:       delete();//System.out.println("3.Delete");
            break;
            case 4:      display();//System.out.println("4.Show");

            break;
            case 5:System.exit(0);
            break;
            default:System.out.println("Envalid Command");
         	}
        }
	}

}

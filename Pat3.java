import java.util.Scanner;
public class Pat3 {
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        int numbersOfRow=scan.nextInt();
        scan.close();
        int pat=numbersOfRow+(numbersOfRow-1);
        for(int i=numbersOfRow;i>0;i--){//row
          for (int space=numbersOfRow-1;space>=i;space--){//space
               System.out.print(" ");
           }
           for (int j=0;j<pat;j++){//pat
               System.out.print("*");
           }
           pat-=2;
            System.out.println();
        }
    }
}

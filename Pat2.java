import java.util.Scanner;
public class Pat2 {
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        int numbersOfRow=scan.nextInt();
        scan.close();
        int pat=1;
        for(int i=0;i<numbersOfRow;i++){//row
           for (int space=numbersOfRow-1;space>=i;space--){//space
               System.out.print(" ");
           }
           for (int j=0;j<pat;j++){
               System.out.print("*");
           }
           pat+=2;
            System.out.println();
        }
    }
}

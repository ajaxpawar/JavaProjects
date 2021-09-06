import java.util.Scanner;
public class Pat1 {
    public static void main(String args[]){
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter numbers of row");
        int numbersOfRow=scan.nextInt();
        scan.close();
        for(int i=0;i<=numbersOfRow;i++){
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

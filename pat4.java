import java.util.*;
public class pat4 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int numberofRow=scan.nextInt();
        scan.close();
        int pat=0;
        for (int row=0;row<numberofRow;row++){//row
            for(int space=(numberofRow-1);space >row;space--){//space
                System.out.print(" ");
            }
            for(int i=0;i<=pat;i++){
                System.out.print(" *");
            }
            pat++;
            System.out.println();

        }
    }
}

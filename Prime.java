import java.util.Scanner;
public class Prime {
    public static void main(String[] args) {
        
        boolean isprime=true;
        System.out.println("Enter Number For Prime Check");
        Scanner scan=new Scanner(System.in);
        int input=scan.nextInt();
        scan.close();
        if(input<=0){
            System.out.println("Invalid Number");
        }
        else {
            for(int i=2;i<input;i++){
                if(input%i==0){
                    isprime=false;
                    break;
                }
            }
            if(isprime){
                System.out.println(input+" is Prime ");
            }
            else{
                System.out.println(input+" Not Prime");
            }
        }
        
    }
}

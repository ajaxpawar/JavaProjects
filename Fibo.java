import java.util.Scanner;
public class Fibo {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        int numberFib=scan.nextInt();
        scan.close();
        if (numberFib<=0){
            System.out.println("Fibonaci series not possible");
        }
        else if(numberFib==1){
            System.out.println("1");
        }
        else if(numberFib==2){
            System.out.println("1");
            System.out.println("2");
        }
        else{
            System.out.println("1");
            System.out.println("2");
            int number1=1;
            int number2=2;
            int sum;
            while(numberFib-2>0){
                sum=number1+number2;
                System.out.println(sum);
                number1=number2;
                number2=sum;
                numberFib-=1;

            }
        }

    }
}

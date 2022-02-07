
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Test{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Process p=Runtime.getRuntime().exec("netsh wlan show profile");
			StringBuilder out=new StringBuilder();
			BufferedReader read=new BufferedReader(new InputStreamReader(p.getInputStream()));
			String line;
			while((line=read.readLine())!=null) {
				out.append(line+"\n");
			}
			
			System.out.println(out);
			System.out.println("*************************************************");
			Scanner scan=new Scanner(System.in);
			System.out.print("Enter Wifi name= ");
			String nameWifi=scan.nextLine();
			nameWifi="\""+nameWifi+"\"";
			System.out.println("*************************************************");
			System.out.println(" Wifi name= "+nameWifi);
			System.out.println("*************************************************");
			Process p2=Runtime.getRuntime().exec("netsh wlan show profile name="+nameWifi+" key=clear");
			StringBuilder out2=new StringBuilder();
			BufferedReader read2=new BufferedReader(new InputStreamReader(p2.getInputStream()));
			String line2;
			while((line2=read2.readLine())!=null) {
				out2.append(line2+"\n");
			}

			System.out.println("*************************************************");
			System.out.println(out2);		
			System.out.println("*************************************************");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}

import java.io.BufferedReader;
import java.io.InputStreamReader;
public class ExperimentJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Process p=Runtime.getRuntime().exec("netsh wlan show profile name=zatchbell key=clear");
			StringBuilder out=new StringBuilder();
			BufferedReader read=new BufferedReader(new InputStreamReader(p.getInputStream()));
			String line;
			while((line=read.readLine())!=null) {
				out.append(line+"\n");
			}
			
			System.out.println(out);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}

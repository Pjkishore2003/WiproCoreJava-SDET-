package IO;
import java.io.*;
public class OutputstreamEX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String data = "poiujhgfdswertghjkiuytfvh";
		try {
			FileOutputStream op = new FileOutputStream("C://Users//kisho//yes yes.txt/");
			byte[]array = data.getBytes();
			op.write(array);
			op.close();
		}catch(Exception e) {
			System.out.println("Failed");
		}
		

	}

}

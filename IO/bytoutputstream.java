package IO;
import java.io.*;
public class bytoutputstream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String data ="iuytfdcvghj";
		try {
			bytoutputstream output = new ByteArrayOutputStream("C://Users//kisho//yes yes.txt/");
			byte[]array = data.getBytes();
			output.write(array);
			String streamData = out.toString();
			System.out.println(streamData);
			output.close();
		}catch (Exception e) {
			System.out.println("fail");
		}

	}

}

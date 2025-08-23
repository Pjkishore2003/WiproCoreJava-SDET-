package IO;

import java.io.*;
public class FilterOutputStreamEx {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileOutputStream fos = null;
		FilterOutputStream filterOutput = null;
		try {
			fos = new FileOutputStream("C:/Users/kisho/yes yes1.txt");
			filterOutput = new BufferedOutputStream(fos);
			String text = "Hi hello";
			filterOutput.write(text.getBytes());
		}catch(Exception e) {
			System.out.println(e);
		}finally {
			filterOutput.close();
			fos.close();
		}
}

	}

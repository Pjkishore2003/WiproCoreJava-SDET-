package IO;
import java.io.*;
import java.io.FileInputStream;
import java.io.FilterInputStream;
public class FilterInputStreamsEx {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileInputStream fis = null;
		FilterInputStream filterinput = null;
		try {
			fis = new FileInputStream("C:/Users/kisho/yes yes.txt");
			filterinput = new BufferedInputStream(fis);
			int data;
			while((data = filterinput.read()) != -1) {
				System.out.print((char)data);
			}
			fis.close();
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}
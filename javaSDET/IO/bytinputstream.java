package IO;
import java.io.*;
public class bytinputstream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte[] array = {2,4,7,9};
		try {
			bytinputstream input = new ByteArrayInputStream(array);
			for(int i = 0; i < array.length;i++) {
				int data = input.read();
				System.out.println(data);
			}
			input.close();
		}catch (Exception e) {
			System.out.println("fsailed");
		}
	}

}

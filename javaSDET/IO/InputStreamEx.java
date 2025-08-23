package IO;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
public class InputStreamEx {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileInputStream input = new FileInputStream("C://Users//kisho//yes yes.txt/");
			System.out.println("Data in the file");
			int i = input.read();
			while(i!=-1) {
				System.out.print((char)i);
				i = input.read();
			}
			input.close();

	}
		catch (IOException e) {
            System.out.println("An error occurred while writing the file.");
            e.printStackTrace();

}
}
}

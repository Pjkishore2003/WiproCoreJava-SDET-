package IO;
import java.io.*;
import java.io.ObjectInputStream;

public class DeserialEx {
	public static void main(String[]args) throws FileNotFoundException, IOException, ClassNotFoundException{
		ObjectInputStream in = new ObjectInputStream(new FileInputStream("C://Users//kisho//student.ser"));
		Student s =(Student)in.readObject();
		System.out.println(s.id+ " "+s.name);
		in.close();
	}

}

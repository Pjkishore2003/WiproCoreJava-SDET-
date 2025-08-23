package IO;

import java.io.*;

public class SerialEx {
    public static void main(String[] args) throws IOException {
        try {
            Student s1 = new Student(211, "John");
            FileOutputStream fout = new FileOutputStream("C://Users//kisho//student.ser");
            ObjectOutputStream out = new ObjectOutputStream(fout);
            out.writeObject(s1);
            out.flush();        
            out.close();
            fout.close();
            System.out.println("Object has been serialized and written to file.");
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}

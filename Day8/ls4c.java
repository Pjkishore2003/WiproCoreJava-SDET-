package pack8;

import java.io.*;
import java.util.*;

public class ls4c {
    public static void main(String[] args) {
        try (ObjectInputStream in = new ObjectInputStream(
                new FileInputStream("C://Users//kisho//Documents//students.ser"))) {
            List<ls4a> students = (List<ls4a>) in.readObject();
            System.out.println("Deserialized Student List:");
            for (ls4a s : students) {
                System.out.println(s);
            }

        } catch (IOException | ClassNotFoundException e) {
        	System.out.println(e);;
        }
    }
}

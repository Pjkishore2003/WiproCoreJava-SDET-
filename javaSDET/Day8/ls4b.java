package pack8;

import java.io.*;
import java.util.*;

public class ls4b {
    public static void main(String[] args) {
        List<ls4a> student = new ArrayList<>();
        student.add(new ls4a(1, "Prema"));
        student.add(new ls4a(2, "jyothi"));
        student.add(new ls4a(3, "kishore"));
        try (ObjectOutputStream out = new ObjectOutputStream(
                new FileOutputStream("C://Users//kisho//Documents//students.ser"))) {
            out.writeObject(student);
            System.out.println("Student list serialized to file.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

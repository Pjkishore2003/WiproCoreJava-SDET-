package IO;

import java.io.*;

public class BufferedWriterReaderExample {
    public static void main(String[] args) {
        try {
            BufferedWriter bw = new BufferedWriter(
                new FileWriter("C://Users//kisho//bufferedfile.txt")
            );
            bw.write("I am the Buffered file writer");
            bw.close();
            BufferedReader br = new BufferedReader(
                new FileReader("C://Users//kisho//bufferedfile.txt")
            );

            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

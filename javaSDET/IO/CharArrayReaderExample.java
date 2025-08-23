package IO;

import java.io.*;

public class CharArrayReaderExample {
    public static void main(String[] args) {
        char[] charArray = { 'k', 'i', 's', 'h', 'o', 'r', 'e', ' ', 'P', 'J' };
        CharArrayReader cr = new CharArrayReader(charArray);
        int ch;
        try {
            while ((ch = cr.read()) != -1) {
                System.out.print((char) ch);
            }
            cr.close();
        } catch (IOException e) {
            System.out.println(e);;
        }
    }
}


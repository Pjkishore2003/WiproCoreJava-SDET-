package IO;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.*;
public class FileWriterReaderEx {

	public static void main(String[] args)throws IOException{
		// TODO Auto-generated method stub
		FileWriter fw= new FileWriter("C:/Users/kishoyes yes.txt");
		fw.write("lollolololooool");
		fw.close();
		FileReader fr = new FileReader("C://Users//kisho//yes yes1"+ ".txt/");
		int i;
		while((i=fr.read())!=-1) {
			System.out.print((char)i);
		}
		fr.close();

	}

}

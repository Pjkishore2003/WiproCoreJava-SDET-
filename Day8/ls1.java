package pack8;
	import java.io.File;
public class ls1 {
		public static void main(String[] args) {
	        String directoryPath = "C://Users//kisho//Documents";
	        File dir = new File(directoryPath);
	        if (dir.isDirectory()) {
	            String[] contents = dir.list();
	            System.out.println("Contents of the directory:");
	            for (String name : contents) {
	                System.out.println(name);
	            }
	        } else {
	            System.out.println("The given path is not a directory.");
	        }
	    }
	}
package pack7;

public class ls1 {
	 public static void main(String[] args) {
		 String input = "a3b3c4";
	        String output = "";
	        for (int i = 0; i < input.length(); i += 2) {
	            char letter = input.charAt(i);
	            int count = input.charAt(i + 1) - '0';
	            while (count-- > 0) {
	                output += letter;
	            }
	        }
	        System.out.println(output);
	    }
	}
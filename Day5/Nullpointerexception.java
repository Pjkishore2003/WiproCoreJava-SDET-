package pack5;

public class Nullpointerexception {
	public static void main(String[]args) {
		try {
			String s1 = null;
			System.out.println(s1.length());
		}catch (Exception e) {
			System.out.println(e);
		}
	}

}

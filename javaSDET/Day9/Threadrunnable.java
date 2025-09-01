package pack9;

public class Threadrunnable {
	public static void main(String[]args) {
		int n=10;
		for(int i =1;i<n;i++) {
			Thread object = new Thread(new ThreadUsingRunnableInterface());
			object.start();
		}
	}

}

package pack9;

public class ThreadUsingRunnableInterface implements Runnable {
	public void run() {
		System.out.println("Thread running");
		System.out.println("Thread"+ Thread.currentThread().getId()+"is running");
	}
}
package pack9;

public class Cooking extends Thread {
	private String task;
	Cooking (String task){
		this.task = task;
	}
	public void run() {
		System.out.println(task + "is being prepared"+ Thread.currentThread().getName());
	}
	public static void main(String[]args) {
		Cooking t1 = new Cooking("Tea");
        Cooking t2 = new Cooking("Maggi");
        Cooking t3 = new Cooking("Omelette");
        
		
	}
	
}

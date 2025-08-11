package labsession;

public class GC {
public void finalize() {
	System.out.println("object is garbage collector");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GC obj = new GC();
		obj = null;
		GC obj1= new GC();
		GC obj2 = new GC();
		obj1 = obj2;
		GC obj4 =new GC();
		Runtime.getRuntime().gc();

	}

}

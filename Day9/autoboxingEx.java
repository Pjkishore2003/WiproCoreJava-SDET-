package pack9;

public class autoboxingEx {
	 public static void main(String[] args) {
	        int x = 5;
	        Integer y = x;
	        System.out.println(x);
	        System.out.println(y);
	     //unboxing
	        Integer a = new Integer(10);
	        int i = a.intValue(); 
	        int j = a; 
	        System.out.println(i);
	        System.out.println(j);
	   
	        int l = new Integer(18);
	        int k = l;
	        System.out.println(k);
	        System.out.println(l);
	 }
}

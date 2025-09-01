package pack6;
import java.util.Stack;

public class stackeg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Stack<String> stack = new Stack<>();
	        stack.push("Prema");
	        stack.push("Jyothi");
	        stack.push("Kishore");
	        System.out.println(stack.peek());
	        System.out.println(stack.pop());
	        System.out.println(stack.size());
	        System.out.println(stack.search("Jyothi"));
	        System.out.println(stack.empty());

	}

}

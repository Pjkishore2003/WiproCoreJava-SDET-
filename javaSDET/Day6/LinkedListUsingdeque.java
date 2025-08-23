package pack6;
import java.util.Deque;
import java.util.LinkedList;
public class LinkedListUsingdeque {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deque<String> deque = new LinkedList<>();
		deque.add("peter");       
        deque.add("king");
        deque.add("Kishore");
        deque.add("first");     
        deque.add("PJ");
        System.out.println( deque);
        System.out.println(deque.peek());
        System.out.println(deque.peekFirst());
        System.out.println(deque.peekLast());
        System.out.println(deque.remove("first"));
        System.out.println( deque);
        System.out.println(deque.poll());
        System.out.println(deque.pollLast());
	}

}


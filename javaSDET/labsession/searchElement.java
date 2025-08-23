package labsession;
import java.util.*;
public class searchElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	        System.out.print("Enter the size of the array: ");
	        int n = sc.nextInt();
	        int[] arr = new int[n];
	        System.out.println("Enter the array elements:");
	        for (int i = 0; i < n; i++) {
	            arr[i] = sc.nextInt();
	        }
	        System.out.print("Enter the element to search: ");
	        int target = sc.nextInt();
	        boolean found = false;
	        for (int i = 0; i < n; i++) {
	            if (arr[i] == target) {
	                System.out.println("Element found at index " + i);
	                found = true;
	                break;
	            }
	        }

	        if (!found) {
	            System.out.println("Element not found in the array.");
	        }
	    }

	}

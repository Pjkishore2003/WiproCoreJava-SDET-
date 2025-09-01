package pack9;
import java.util.Scanner;
public class ls4 {
    static int sum = 0;
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the limit: ");
        int j = sc.nextInt();
        sc.close();
        int mid = j / 2;
        Thread t1 = new Thread((
        		) -> addPrimes(2, mid));
        Thread t2 = new Thread(() -> addPrimes(mid + 1, j));
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("Sum of prime numbers up to " + j + " is: " + sum);
    }
    static void addPrimes(int start, int end) {
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) sum += i;
        }
    }
    static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++)
            if (n % i == 0) return false;
        return true;
    }
}


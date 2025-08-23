package pack8;
import java.util.Scanner;
public class ls2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        System.out.println("Output :");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        sc.close();
    }
}

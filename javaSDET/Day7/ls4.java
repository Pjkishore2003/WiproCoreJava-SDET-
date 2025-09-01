package pack7;

public class ls4 {
	public static void main(String[] args) {
        print(1);
    }
    static void print(int num) {
        if (num <= 100) {
            System.out.println(num);
            print(num + 1);
        }
    }
}

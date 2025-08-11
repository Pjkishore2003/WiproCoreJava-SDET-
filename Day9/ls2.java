package pack9;

public class ls2 {
    public static void main(String[] args) {
        Thread even = new Thread(() -> {
            for (int i = 0; i <= 8; i += 2) {
                System.out.println("Even: " + i);
            }
        });
        Thread odd = new Thread(() -> {
            for (int i = 1; i <= 8; i += 2) {
                System.out.println("Odd: " + i);
            }
        });
        even.start();
        odd.start();
    }
}

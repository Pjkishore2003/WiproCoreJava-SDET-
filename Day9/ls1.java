package pack9;

public class ls1 extends Thread {
    public void run() {
        System.out.println("Hello, World");
    }

    public static void main(String[] args) {
       ls1 a = new ls1();
        a.start(); 
    }
}

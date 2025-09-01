package pack7;
public class ls3 {
	public static void main(String[]args) {
	String input = "swiss";
    for (int i = 0; i < input.length(); i++) {
        char ch = input.charAt(i);
        boolean isUnique = true;
        for (int j = 0; j < input.length(); j++) {
            if (i != j && input.charAt(j) == ch) {
                isUnique = false;
                break;
            }
        }
        if (isUnique) {
            System.out.println(ch);
            return;
        }
    }
    System.out.println("No non-repeating character found.");
}
}

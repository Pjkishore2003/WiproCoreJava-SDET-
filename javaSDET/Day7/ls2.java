package pack7;
public class ls2 {
	public static void main(String[] args) {
        int[] arr = {10, 20, 5, 98, 50, 30};
        int larg = arr[0];
        int secLarg = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > larg) {
                secLarg = larg;
                larg = arr[i];
            } else if (arr[i] > secLarg && arr[i] != larg) {
                secLarg = arr[i];
            }
        }
        System.out.println(secLarg);
}
}

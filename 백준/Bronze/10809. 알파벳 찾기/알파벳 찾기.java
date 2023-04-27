import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] alphabet = new int[26];

		for (int i = 0; i < alphabet.length; i++) {
			alphabet[i] = -1;
		}

		String s = sc.next();
		for (int i = 0; i < s.length(); i++) {
			int charToIndex = s.charAt(i)-97;
			if(alphabet[charToIndex]==-1){
				alphabet[charToIndex] = i;
			}
		}
		for (int i = 0; i < alphabet.length; i++) {
			System.out.print(alphabet[i] + " ");
		}
	}
}
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {

			String answer = "";
			int repeat = sc.nextInt();
			String origin = sc.next();
			for (int j = 0; j < origin.length(); j++) {
				answer += Character.toString(origin.charAt(j)).repeat(repeat);
			}
			System.out.println(answer);
		}
	}
}
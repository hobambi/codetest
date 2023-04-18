import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		String answer = "";
		int max = sc.nextInt();
		int min = max;

		for (int i = 0; i < num - 1; i++) {
			int x = sc.nextInt();
			if (x > max)
				max = x;
			if (x < min)
				min = x;
		}
		answer = min + " " + max;

		System.out.println(answer);
	}
}
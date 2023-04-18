import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextInt();
		String answer = "";
		int mok = (int)(a/4);
		for (int i = 0; i < mok; i++) {
			answer += "long ";
		}
		answer += "int";

		System.out.println(answer);
	}
}
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int max = sc.nextInt();
		String answer = "";
		int[] arr = new int[num];

		for (int i = 0; i < num; i++) {
			arr[i] = sc.nextInt();
		}

		for (int i = 0; i < num; i++) {
			if (arr[i] < max )
				answer += arr[i] + " ";
		}

		System.out.println(answer);
	}
}
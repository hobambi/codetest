import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ballMax = sc.nextInt();
		int num = sc.nextInt();

		int[] arr = new int[ballMax];

		for (int i = 0; i < num; i++) {
			int start = sc.nextInt();
			int finish = sc.nextInt();
			int ball = sc.nextInt();

			for (int j = start-1; j < finish; j++) {
				arr[j] = ball;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
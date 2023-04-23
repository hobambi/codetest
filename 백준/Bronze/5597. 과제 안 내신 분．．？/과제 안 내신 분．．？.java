import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] arr = new int[30];

		for (int i = 0; i < 28; i++) {
			int key = sc.nextInt();
			arr[key - 1] = -1;
		}

		int[] answer = new int[2];
		int index = 0;
		for (int i = 0; i < 30; i++) {
			if (arr[i] == 0) {
				answer[index] = i + 1;
				index++;
			}
		}
		System.out.println(Math.min(answer[0], answer[1]));
		System.out.println(Math.max(answer[0], answer[1]));
	}
}
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int answer = 0;
		int[] arr = new int[num];
		for (int i = 0; i < num; i++) {
			arr[i] = sc.nextInt();
		}
		int find = sc.nextInt();

		for (int i = 0; i < num; i++) {
			if (arr[i] == find)
				answer++;
		}

		System.out.println(answer);
	}
}
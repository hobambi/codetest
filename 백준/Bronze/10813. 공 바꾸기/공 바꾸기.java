import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int bucket = sc.nextInt();
		int num = sc.nextInt();

		int[] arr = new int[bucket];
		for (int i = 0; i < bucket; i++) {
			arr[i] = i+1;
		}

		for (int i = 0; i < num; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int temp = arr[a - 1];
			arr[a-1] = arr[b-1];
			arr[b-1] = temp;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
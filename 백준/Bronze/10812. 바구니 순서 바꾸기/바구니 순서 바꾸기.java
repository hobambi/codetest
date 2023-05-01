import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int bucket = sc.nextInt();
		int[] arr = new int[bucket];

		int n = sc.nextInt();

		for (int i = 0; i < bucket; i++) {
			arr[i] = i + 1;
		}
		int[] temp = arr.clone();

		for (int i = 0; i < n; i++) {
			int first = sc.nextInt() - 1;
			int end = sc.nextInt() - 1;
			int mid = sc.nextInt() - 1;

			for (int j = 0; j < end-mid+1; j++) {
				temp[first+j] = arr[mid + j];
			}
			for (int j = 0; j < mid-first; j++) {
				temp[end - mid + 1 + j+first] = arr[first + j];
			}
			arr = temp.clone();
		}
		for (int i = 0; i < bucket; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
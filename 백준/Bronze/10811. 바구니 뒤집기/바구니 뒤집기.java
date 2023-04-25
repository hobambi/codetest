import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] bucket = new int[n];
		for (int i = 0; i < bucket.length; i++) {
			bucket[i] = i+1;
		}
		n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			int first = sc.nextInt() -1;
			int end = sc.nextInt() -1;

			for (int j = 0; j < (end-first)/2+1; j++) {
				int temp = bucket[first+j];
				bucket[first+j] = bucket[end-j];
				bucket[end-j] = temp;
			}
		}
		for (int answer : bucket) {
			System.out.print(answer+ " ");
		}
	}
}
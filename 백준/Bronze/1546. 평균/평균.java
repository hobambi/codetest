import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		int max = -1;

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
			if(max < arr[i]){
				max = arr[i];
			}
		}
		double average = 0.0;
		for (int i = 0; i < n; i++) {
			average += arr[i]/(double)max*100;
		}

		System.out.println(average/n);

	}
}
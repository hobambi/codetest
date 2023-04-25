import java.util.HashMap;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[][] arr = new int[2][10];

		for (int i = 0; i < 10; i++) {
			arr[0][i] = sc.nextInt();
			arr[1][i] = arr[0][i]%42;
		}

		HashMap<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < 10; i++) {
			map.put(arr[1][i], map.getOrDefault(arr[1][i],0)+1);
		}

		System.out.println(map.size());

	}
}
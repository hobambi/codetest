import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int all = sc.nextInt();

		for (int i = 0; i < all; i++) {
			int n = sc.nextInt();

			double aver = 0;
			double up = 0;
			ArrayList<Integer> list = new ArrayList<>();
			for (int j = 0; j < n; j++) {
				list.add(sc.nextInt());
				aver += list.get(j);
			}
			aver = aver/n;
			for (int j = 0; j < n; j++) {
				if(list.get(j) > aver){
					up++;
				}
			}

			System.out.println(String.format("%.3f",100*up/n) + "%");

		}
	}
}
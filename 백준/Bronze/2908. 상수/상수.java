import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] arr = new int[2];

		for (int i = 0; i < 2; i++) {
			arr[i] = sc.nextInt();
		}

		int[] answer = new int[2];
		for (int i = 0; i < 2; i++) {
			int one = arr[i]%10;
			int ten = (arr[i]%100)/10;
			int hund = arr[i]/100;
			
			answer[i] = one*100 + ten*10 + hund;
		}

		System.out.println(Math.max(answer[0],answer[1] ));
	}
}
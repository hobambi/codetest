import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String s = sc.nextLine();
		if(s.isEmpty() || s.equals(" ")){
			System.out.println(0);
			return;
		}

		if(s.charAt(0)==' ')
			s = s.substring(1);
		String[] arr = s.split(" ");
		System.out.println(arr.length);
		
	}
}
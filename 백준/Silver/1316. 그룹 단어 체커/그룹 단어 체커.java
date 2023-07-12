import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int answer = 0;
		int no = 0;

		for (int i = 0; i < n; i++) {
			String s = sc.next();
			HashMap<Character, Integer> map = new HashMap<>();
			char before = ' ';

			for (int j = 0; j < s.length(); j++) {
				char c = s.charAt(j);
				if (!map.containsKey(c)) {
					map.put(c,1);
					before = c;
				}else if(before != c) {
					no++;
					break;
				}
			}
		}
		answer = n - no;
		System.out.println(answer);
	}
}
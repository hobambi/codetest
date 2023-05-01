import java.util.HashMap;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String s = sc.nextLine();
		s = s.toUpperCase();

		HashMap<Character, Integer> map = new HashMap<Character,Integer>();

		for (int i = 0; i < s.length(); i++) {
			map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
		}
		
		int max = 0;
		Character answer = ' ';

		for (Character c : map.keySet()) {
			if(max < map.get(c)){
				answer = c;
				max = map.get(c);
			} else if (max == map.get(c)) {
				answer = '?';
			}
		}
		System.out.println(answer);
	}
}
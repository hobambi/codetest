import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String s = sc.nextLine();

		String[] arr = s.split("");
		int answer = 0;

		for (int i = 0; i < arr.length; i++) {
			if(arr[i].equals("A") || arr[i].equals("B") || arr[i].equals("C")){
				answer += 3;
			} else if (arr[i].equals("D") || arr[i].equals("E") || arr[i].equals("F")) {
				answer += 4;
			} else if (arr[i].equals("G") || arr[i].equals("H") || arr[i].equals("I")) {
				answer += 5;
			} else if (arr[i].equals("J") || arr[i].equals("K") || arr[i].equals("L")) {
				answer += 6;
			} else if (arr[i].equals("M") || arr[i].equals("N") || arr[i].equals("O")) {
				answer += 7;
			} else if (arr[i].equals("P") || arr[i].equals("Q") || arr[i].equals("R")|| arr[i].equals("S")) {
				answer += 8;
			} else if (arr[i].equals("T") || arr[i].equals("U") || arr[i].equals("V")) {
				answer += 9;
			}  else if (arr[i].equals("W") || arr[i].equals("X") || arr[i].equals("Y")|| arr[i].equals("Z")) {
				answer += 10;
			}
		}
		System.out.println(answer);
	}
}
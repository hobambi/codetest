import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String s = sc.nextLine();
		int answer = 0;
		boolean change = false;
		while (s.length()>0) {

			change = false;
			if(s.contains("c=")){
				s = s.replaceFirst("c="," ");
				answer++;
				change = true;
			} else if (s.contains("c-")) {
				s = s.replaceFirst("c-"," ");
				answer++;
				change = true;
			} else if (s.contains("d-")) {
				s = s.replaceFirst("d-"," ");
				answer++;
				change = true;
			} else if (s.contains("lj")) {
				s = s.replaceFirst("lj", " ");
				answer++;
				change = true;
			} else if (s.contains("nj")) {
				s = s.replaceFirst("nj", " ");
				answer++;
				change = true;
			} else if (s.contains("s=")) {
				s = s.replaceFirst("s="," ");
				answer++;
				change = true;
			} else if (s.contains("z=")) {
				if(s.contains("dz=")){
					s = s.replaceFirst("dz="," ");
					answer++;
					change = true;
				}else {
					s = s.replaceFirst("z=", " ");
					answer++;
					change = true;
				}
			}
			if(!change) break;
		}
		s = s.replace(" ","");
		System.out.println(answer+(s.length()));
	}
}
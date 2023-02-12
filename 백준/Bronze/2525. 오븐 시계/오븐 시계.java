import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int m = sc.nextInt();
        int t = sc.nextInt();
        int r =m+t;

        if (m+t<60){
            System.out.println(h+" "+ (m+t));
        } else {
            while (r>=60){
                r = r-60;
                h = h+1;
            }
            if(h<24){
                System.out.println(h+" "+r);
            }else{
                System.out.println((h-24)+" "+r);
            }
        }
    }
}
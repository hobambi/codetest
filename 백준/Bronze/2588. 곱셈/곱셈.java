import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int o = (b%100)%10;
        int t = (b%100)/10;
        int h = b/100;

        System.out.println(a*o);
        System.out.println(a*t);
        System.out.println(a*h);
        System.out.println(a*b);
    }
}
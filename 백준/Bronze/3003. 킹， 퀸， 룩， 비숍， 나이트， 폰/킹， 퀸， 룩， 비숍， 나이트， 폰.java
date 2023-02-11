import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[6];
        for (int i = 0; i < 6; i++) {
            num[i] = sc.nextInt();
        }
        System.out.println(-(num[0] - 1));
        System.out.println(-(num[1] - 1));
        System.out.println(-(num[2] - 2));
        System.out.println(-(num[3] - 2));
        System.out.println(-(num[4] - 2 ));
        System.out.println(-(num[5] - 8));

    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = sc.nextInt();
        int num = sc.nextInt();
        int cal = 0;
        int[][] arr = new int[num][2];
        for (int i = 0; i < num; i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
            cal += arr[i][0] * arr[i][1];
        }
        if(total==cal){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }
}


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int arr[] = {a,b,c};
        int m = 0;

        if (a == b && b == c) {
            System.out.println(10000 + a * 1000);
        } else {
            if (a!=b && b!=c && a!=c) {
                for(int i =0; i<3;i++){
                    if(arr[i]>=m){
                        m =arr[i];
                    }
                }
                System.out.println(m*100);
            } else if(a==b || b==c){
                System.out.println(1000+b*100);
            }else {
                System.out.println(1000+a*100);
            }

        }
    }
}

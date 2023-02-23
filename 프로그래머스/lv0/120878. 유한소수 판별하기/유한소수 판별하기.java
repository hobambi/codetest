import java.util.*;

class Solution {
    public int solution(int a, int b) {
        int answer = 1;
        HashSet<Integer> soinsu = new HashSet<>();
        ArrayList<Integer> asu = new ArrayList<>();

        for (int i = 2; i <= a; i++) {
            if (a % i == 0) {
                asu.add(i);

                    a /= i;
            
                if (a == 1) break;
            }
        }
        for(Integer i : asu) {
            if( b % i == 0){
                    b /= i;

                if (b == 1) return 1;
            }
        }

        for (int i = 2; i <= b; i++) {
            if (b % i == 0) {
                if (i != 5 && i != 2) return 2;
                soinsu.add(i);
                while (b % i == 0) {
                    b /= i;
                }
                if (b == 1) break;
            }
        }

        return answer;
    }
}
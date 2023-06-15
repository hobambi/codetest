import java.util.*;

class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
        
        Stack<Integer> q = new Stack<>();
        for(int i = 0; i < flag.length; i++) {

            if(flag[i]) {
                int n = arr[i]*2;
                for(int j = 0; j < n; j++) {
                    q.push(arr[i]);
                }
            }else {
                int n = arr[i];
                for(int j = 0; j < n; j++) {
                    q.pop();
                }
            }
        }
        int[] answer = new int[q.size()];
        for(int i = answer.length -1 ; i >= 0; i--) {
            answer[i] = q.pop();
        }
        return answer;
    }
}
import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        String[] arrS = s.split(" ");
        int[] arr = new int[arrS.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(arrS[i]);
        }
        Arrays.sort(arr);

        answer = arr[0] + " " + arr[arr.length - 1];
        return answer;
    }
}
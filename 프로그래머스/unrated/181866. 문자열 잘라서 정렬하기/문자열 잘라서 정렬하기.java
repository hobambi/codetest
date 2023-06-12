import java.util.*;

class Solution {
    public ArrayList<String> solution(String myString) {
        String[] arr = myString.split("x");
        
        ArrayList<String> answer = new ArrayList<>();
        for(int i = 0; i < arr.length; i++) {
            if(!(arr[i].equals("") || arr[i].length() == 0)) {
                answer.add(arr[i]);
            }
        } 
        Collections.sort(answer);
        return answer;
    }
}
import java.util.*;

class Solution {
    public ArrayList<String> solution(String myStr) {
        String[] arr = myStr.split("[a-c]+");
        
        ArrayList<String> answer = new ArrayList<>();
        
        for(int i = 0; i < arr.length; i++) {
            if(!arr[i].isEmpty()) {
                answer.add(arr[i]);
            }
        }
        if(answer.size() == 0) {
            answer.add("EMPTY");
        }
        
        return answer;
    }
}
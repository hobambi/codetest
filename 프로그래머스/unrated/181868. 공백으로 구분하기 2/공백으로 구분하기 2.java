 import java.util.ArrayList;

class Solution {
    public ArrayList<String> solution(String my_string) {
        ArrayList<String> answer = new ArrayList<>();
        String[] arr = my_string.split(" ");
        for(int i = 0; i < arr.length; i++) {
            if(!(arr[i].equals("") || arr[i].isEmpty())) {
                answer.add(arr[i]);
            }
        }
        
        
        return answer;
    }
}
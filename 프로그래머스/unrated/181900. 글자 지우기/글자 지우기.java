import java.util.*;

class Solution {
    public StringBuilder solution(String my_string, int[] indices) {
        StringBuilder answer = new StringBuilder();
        Arrays.sort(indices);
        int index = 0;
    
        for(int i = 0; i < my_string.length(); i++) {
            if(index >= indices.length) {
                answer.append(my_string.charAt(i));
                continue;
            }
            if(i == indices[index]) {
                index++;
            }else {
                answer.append(my_string.charAt(i));
            }
        }
        return answer;
    }
}
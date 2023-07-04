import java.util.*;

class Solution {
    public int solution(String[] strArr) {
        int answer = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i = 0; i < strArr.length; i++) {
            int n = strArr[i].length();
            map.put(n,map.getOrDefault(n,0)+1);
        }
        
        for(Map.Entry<Integer,Integer> entry : map.entrySet()) {
            if(entry.getValue() > answer) answer = entry.getValue();
        }
        return answer;
    }
}
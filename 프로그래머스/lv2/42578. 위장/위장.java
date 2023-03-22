import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;

		HashMap<String, Integer> map = new HashMap<String,Integer>(); 
		for (String[] c: clothes){
			map.put(c[1], map.getOrDefault(c[1], 0) + 1);
		}
		for (Integer value : map.values()) {
			answer *= value+1;
		}

		return answer-1;
    }
}
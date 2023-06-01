import java.util.*;

class Solution {
	public List<Integer> solution(int[] arr, int[] delete_list) {
		List<Integer> answer = new ArrayList<>();
		Set<Integer> set = new HashSet<>();
		for (int i = 0; i < delete_list.length; i++) {
			set.add(delete_list[i]);
		}

		for (int i = 0; i < arr.length; i++) {
			if (!set.contains(arr[i]))
				answer.add(arr[i]);
		}
		return answer;
	}
}
import java.util.*;

class Solution {
    public int solution(int[] people, int limit) {
        
        if(people.length == 1)
			return 1;
        int answer = 0;
        
        Arrays.sort(people);
		Integer arr[] = Arrays.stream(people).boxed().toArray(Integer[]::new);
		List<Integer> peopleList = new ArrayList<>(Arrays.asList(arr));

		while (peopleList.size() != 0) {
			Integer fat = peopleList.get(peopleList.size() - 1);

				Integer thin = peopleList.get(0);

				if (limit - fat >= thin) {
					peopleList.remove(peopleList.size() - 1);
					peopleList.remove(0);
				} else {
					peopleList.remove(peopleList.size() - 1);
				}
				answer += 1;
			if (peopleList.size() == 1) {
				answer += 1;
				return answer;
			}
		}
        
        return answer;
    }
}
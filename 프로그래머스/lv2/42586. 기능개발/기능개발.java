import java.util.*;

class Solution {
    public ArrayList solution(int[] progresses, int[] speeds) {
        ArrayList<Integer> answer = new ArrayList<>();
		Queue<Integer> q = new LinkedList<>();

		for (int i = 0; i < progresses.length; i++) {
			int a = progresses[i];
			int n = 0;
			while (a < 100) {
				a += speeds[i];
				n++;
			}
			q.add(n);
		}

		int m = q.poll();
		int index = 1;
		for (Integer i : q) {
			if (m >= i)
				index++;
			else {
				answer.add(index);
				m = i;
				index = 1;
			}
		}
		answer.add(index);
        return answer;
    }
}
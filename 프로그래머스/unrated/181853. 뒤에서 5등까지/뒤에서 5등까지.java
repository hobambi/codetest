import java.util.ArrayList;
import java.util.Arrays;
//sort 사용하지 않기
// arraylist에 num_list 옮기기
// 반복문 돌면서 최솟값 찾기
// 최소값 찾으면 지우고 다시 반복문 돌기
// arraylist size ==1 이면 반복문 나오고 리턴
class Solution {
	public int[] solution(int[] num_list) {
		int[] answer = new int[5];
		int index = 0;
		ArrayList<Integer> list = new ArrayList<>(num_list.length);

		for(int i = 0; i < num_list.length; i++) {
			list.add(num_list[i]);
		}


		while(list.size() > 0) {
			int min = list.get(0);
			for(Integer n : list) {
				if(min > n){
					min = n;
				}
			}
			answer[index] = min;
			index++;
			list.remove(Integer.valueOf(min));
			if(index >= 5 ) break;
		}

		return answer;
	}
}
class Solution {
    public int solution(int[] arr) {
        int answer = -1;
        
		while(true) {
			boolean check = false;
			for(int i = 0; i < arr.length; i++) {

				if(arr[i] > 50 && arr[i]%2 == 0) {
					arr[i] /= 2;
					check = true;
				}
				else if(arr[i] < 50 && arr[i]%2 != 0) {
					arr[i] = arr[i]*2 + 1;
					check = true;
				}
			}
			answer += 1;
			if(!check) break;
		}
        
        return answer;
    }
}
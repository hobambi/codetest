class Solution {
	public int solution(String my_string, String target) {
		int answer = 0;
		for(int i = 0; i < my_string.length()-target.length()+1; i++){
			if(my_string.charAt(i) == target.charAt(0)){
				String temp = my_string.substring(i,i+target.length());
				if(temp.equals(target))
					return 1;
			}
		}
		return answer;
	}
}
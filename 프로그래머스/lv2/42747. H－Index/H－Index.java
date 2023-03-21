class Solution {
    public int solution(int[] citations) {
        int answer = 0;
        
        if(citations.length==1)
			return 1;
        
        for (int i = 0; i < citations.length; i++) {

			int num = 0;

			for (int j = 0; j < citations.length; j++) {
				if (i <= citations[j]) {
					num += 1;
				}
			}
			if(i>=num){
				return num;
			}
            
            if(i==citations.length-1 && i<num)
				return citations.length;
		}
        
        return answer;
    }
}
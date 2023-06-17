class Solution {
    public int[] solution(int[] arr) {
        
        if(arr.length == 1) return arr;
        
		int[] two = new int[]{2,4,8,16,32,64,128,256,512,1024};
		int size = 0;
		for(int i = 0; i < two.length; i++) {
			if(arr.length <= two[i]){
				size = two[i];
				break;
			}
		}
		if(arr.length == size) return arr;

		int[] answer = new int[size];

		for(int i = 0; i < arr.length; i++ ) {
			answer[i] = arr[i];
		}
        
        return answer;
    }
}
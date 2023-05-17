class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int answer = 0;
        int one = 0;
        int two = 0;
        if(arr1.length > arr2.length) return 1;
        else if(arr1.length < arr2.length) return -1;
        for(int i : arr1) {
            one += i;
        }
        for(int i : arr2) {
            two += i;
        }

        if(one > two) answer = 1;
        else if(one == two) {
            if(arr1.length > arr2.length) answer = 1;
            else if(arr1.length < arr2.length) answer = -1;
            else answer = 0;
        }
        else answer = -1;
        return answer;
    }
}
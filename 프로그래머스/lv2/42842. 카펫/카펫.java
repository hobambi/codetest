class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];

		int hap = brown / 2 + 2;
		int gop = brown + yellow;

		answer[0] = (int)((hap + Math.sqrt((Math.pow(hap, 2)) - 4 * gop))) / 2;
		answer[1] = (int)((hap - Math.sqrt(Math.pow(hap, 2) - 4 * gop))) / 2;
        return answer;
    }
}
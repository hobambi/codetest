class Solution {
	public int[] solution(String s) {
		int[] answer = new int[2];
		String binaryString = "";
		for (int i = 0; i < s.length(); i++) {
			int value = Character.getNumericValue(s.charAt(i));
			if(value==0) {
				answer[1]++;
			}else {
				binaryString += value;
			}
		}
		answer[0]++;
		binaryString = Integer.toBinaryString(binaryString.length());
		while (binaryString.length() > 0) {
			String temp = "";
			boolean zero = false;
			for (int i = 0; i < binaryString.length(); i++) {
				int value = Character.getNumericValue(binaryString.charAt(i));
				if(value==0) {
					answer[1]++;
					zero = true;
				}else {
					temp += value;
				}
			}
			binaryString = Integer.toBinaryString(temp.length());
			if(!zero && binaryString.equals("1")) {
				break;
			}
			else {
				answer[0]++;
			}
		}
		return answer;
	}
}
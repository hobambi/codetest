import java.util.*;


class Solution
{
    public int solution(String s)
    {
       int answer = 0;

		if (s.length() == 1)
			return 0;

		char c = s.charAt(0);
		Stack<Character> stack = new Stack<>();
		stack.add(s.charAt(0));

		for (int i = 1; i < s.length(); i++) {
            
           if(stack.isEmpty()){
				stack.add(s.charAt(i));
				continue;
			}

			if(stack.peek() == s.charAt(i)){
				stack.pop();
			}else {
				stack.add(s.charAt(i));
			}
		}

		if(stack.isEmpty())
			answer = 1;

		return answer;
    }
}
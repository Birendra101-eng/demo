package demo;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ParenthesisQ {

	public static void main(String[] args) {
		
		String test="(())";
		

		System.out.println(longestSubString(test,0,test.length(),new HashMap<>()));

	}
	
	private static String longestSubString(String input, int start, int end, Map<String, Boolean> data) {

		String test = input.substring(start, end);
		if (data.containsKey(test) == false && isbalanced(test))
			return test;
		data.put(test, false);
		String l1 = longestSubString(input, start + 1, end, data);
		String l2 = longestSubString(input, start, end - 1, data);

		return l1.length() > l2.length() ? l1 : l2;

	}
	
	
	
	private static boolean isbalanced(String input) {
		// ()()()

		Stack<Character> st = new Stack<>();
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if ('(' == ch) {
				st.push(ch);
			} else if (')' == ch) {

				if (st.isEmpty())
					return false;
				char last = st.pop();
				if (last != '(')
					return false;
			}

		}

		return st.isEmpty();
	}

}

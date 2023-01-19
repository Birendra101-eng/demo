package demo;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import javax.swing.text.NavigationFilter.FilterBypass;

public class Demo {

	public static void main(String[] args) {
		// series of numbers: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34
		//System.out.println(fib(5));

		
		/*Find the longest substring with a non-repeating character. 
		 
		Example :  
		 
		Case 1
		Input : “abcda”
		Output: abcd*/
		
		System.out.println(longestSubString("abcdahjklzxcv"));
	}

	static int fib(int n) {
		if (n <= 1)
			return 0;
		if (n == 2 || n == 3)
			return 1;

		return fib(n - 1) + fib(n - 2);
	}
	
	
	static  String longestSubString(String input) {
		
		int size = input.length();
		
		int start=0;
		int max_length=0;
		int max_start=0;
		
		//abcdahjklzxcv
		
		String op="";
		Map<Character,Integer> map=new HashMap<>();
		for(int i=0; i < size; i++) {
			char current = input.charAt(i);
			if(map.containsKey(current)) {
				start=i;
				
				
			}
			map.put(current, i);
			
			if(i-start+1 > max_length) {
				max_length=i-start+1;
				max_start=start;
				
			}
			//max_length= Math.max(max_length, i-start+1);
			System.out.println(max_start + "-" + i + "-" + max_length);
			op= input.substring(max_start,i+1);
		}
		return op;
	}

}

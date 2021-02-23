package javaPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

import org.testng.annotations.Test;

public class GeneralPrograms {
	
	@Test(enabled = false)
	
	// Fibonacci series
	
	public void fibonacci() {
		
		int a = 0, b = 1;
		int num = 10;
		ArrayList<Integer> arr = new ArrayList<Integer>();
		for (int i =2; i <=num; ++i) {
			int sum = a+b;
			a = b;
			b = sum;
			arr.add(a);
		}
		System.out.println(arr);
	}
	
	
	@Test(enabled = false)
	
	// String Reverse with words in order
	
	public void reverse1() {
		
		String str = "This is going to be interesting enough to keep me hooked";
		String[] str1 = str.split(" ");
		
		ArrayList<String> arr = new ArrayList<String>(Arrays.asList(str1));
		Collections.reverse(arr);
		System.out.println(arr);
		
		StringBuilder sb = new StringBuilder();
		for (String item : arr) {
			sb.append(item);
			sb.append(" ");
			
		}
		
		System.out.println(sb.toString());
	}
	
	
	@Test(enabled = false)
	
	// String reverse with entire line reversed
	
	public void reverse2() {
		
		String str = "Reverse this string entirely with no character in original format";
		String rev = "";
		for (int i=str.length()-1; i >= 0 ; i--) {
			rev = rev + str.charAt(i);	
		}
		System.out.println(rev);
	}
	
	
	@Test(enabled = false)
	
	// String reverse with keeping spaces intact
	
	public void reverse3() {
		
		String str = "Great disposition for all";
		String strnew = str.replaceAll("\\s+", "");
		StringBuilder sb = new StringBuilder(strnew);
		sb.reverse();
		System.out.println(sb);
		for (int i=0; i <=str.length()-1; i++) {
			if (str.charAt(i) == ' ') {
				sb.insert(i, " ");
			}
		}
		System.out.println(sb);
	}
	
	
	@Test(enabled = false)
	
	// Factorial of a number
	
	public void fact() {
		int num = 6;
		int fact = 1;
		for (int i=num; i>0; i--) {
			fact = fact * i;
		}
		System.out.println("The factorial of the number is : " + fact );
	}
	
	
	@Test(enabled = false)
	
	// Integer Palindrome
	
	public void intReverse() {
		
		int num = 123454321;
		int rev = 0;
		while (num != 0) {
			int remainder = num % 10;
			num = num/10;
			System.out.println(remainder);
			rev = (rev * 10) + remainder;
		}
		System.out.println(rev);
		System.out.println(num);
		if (rev == num) {
			System.out.println("It is a Palindrome");
		}
		else {
			System.out.println("Not a palindrome");
		}
	}
	
	
	@Test(enabled = false)
	
	// Remove duplicates from array
	
	public void dup1() {
		
		String[] str = {"a","c","g","d","t","a","c","d","e","t","j","c"};
		int count = str.length;
		
		ArrayList<String> arr = new ArrayList<String>();
		
		for (int i=0; i<count-1; i++) {
			if (!(arr.contains(str[i]))) {
				arr.add(str[i]);
			}
			else {
				continue;
			}
			
		}
		System.out.println(arr);
	}
	
	
	@Test(enabled = false)
	
	// Square root of a number
	
	public void sqRoot() {
		
		int num = 10;
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i=1; i<=num;i++) {
			int sq = i * i;
			map.put(i, sq);
		}
		
		System.out.println(map);
	}
	
	
	@Test(enabled = false)
	
	// Check for String anagram
	
	public void anagram() {
		
		String str1 = "Dormitory";
		String str2 = "Dirty room";
		
		ArrayList<String> arr1 = new ArrayList<String>(Arrays.asList(str1.split("")));
		System.out.println(arr1);
		Collections.sort(arr1);
		
		ArrayList<String> arr2 = new ArrayList<String>(Arrays.asList(str2.replaceAll("\\s+", "").split("")));
		System.out.println(arr2);
		Collections.sort(arr2);
		
		if (arr1.equals(arr2)) {
			System.out.println("Anagram");
		}
		else {
			System.out.println("Not anagram of each other");
		}
		
	}
	
	
	
	@Test
	
	// The first repeated character of string
	
	public void first() {
		
		String str = "mississippi";
		ArrayList<String> arr = new ArrayList<String>(Arrays.asList(str.split("")));
		System.out.println(arr);
		
	}
	
}

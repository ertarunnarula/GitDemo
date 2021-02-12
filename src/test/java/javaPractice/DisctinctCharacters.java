package javaPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

import org.testng.annotations.Test;

public class DisctinctCharacters {
	
	@Test(priority=1)
	public void duplicate() {
		String str = "This is the string where we need to find duplicate characters";
		char[] ch = str.toCharArray();
		
		
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for (char item : ch) {
			if ((map.containsKey(item)) && !(item == ' ')) {
				map.put(item, map.get(item)+1);
			}
			else {
				map.put(item,1);
			}
		}
		
		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			if (entry.getValue() > 1) {
				System.out.println(entry.getKey() + ": " + entry.getValue());
			}
		}
	}
	
	@Test(priority=2)
	public void distinct() {
		String str = "This is the string where we need to find distinct characters";
		char[] ch = str.toLowerCase().toCharArray();
		
		ArrayList<Character> arr = new ArrayList<Character>();
		for (char item : ch) {
			if (!(arr.contains(item)) && !(item == ' ')) {
				arr.add(item);
			}
			else {
				continue;
			}
		}
		
		StringBuilder sb = new StringBuilder();
		for (Character alpha : arr) {
			sb.append(alpha);
		}
		System.out.println(sb.toString());
	}
	
	@Test(priority=3)
	public void occurence() {
		
		String str = "This is the string where we need to remove occurence of characters";
		char[] ch = str.toLowerCase().toCharArray();
		
		ArrayList<Character> arr = new ArrayList<Character>();
		for (char item : ch) {
			if (!(arr.contains(item)) || (item == ' ')) {
				arr.add(item);
			}
			else {
				continue;
			}
		}
		
		StringBuilder sb = new StringBuilder();
		for (Character alpha : arr) {
			sb.append(alpha);
		}
		System.out.println(sb.toString());
		
	}
	
	@Test(priority=4)
	public void numberOfWords() {
		String str = "This is the string where we need to find number of words in the sentence";
		String[] str2 = str.split(" ");
		int count = str2.length;
		System.out.println("The number of words in the sentence are : " + count);
	}
	
	@Test(priority = 5)
	public void sameCharacters() {
		String str = "This is the string where we need to find number of words in the sentence";
		String str2 = "where we need to find number of words This is the string in the sentence";
		char[] ch = str.toLowerCase().toCharArray();
		char[] ch1 = str2.toLowerCase().toCharArray();
		
		ArrayList<Character> arr1 = new ArrayList<Character>();
		for (char item : ch) {
			if (!(arr1.contains(item)) && !(item == ' ')) {
				arr1.add(item);
			}
			else {
				continue;
			}

		}
		
		
		ArrayList<Character> arr2 = new ArrayList<Character>();
		for (char item1 : ch1) {
			if(!(arr2.contains(item1)) && !(item1 == ' ')) {
				arr2.add(item1);
			}
			else {
				continue;
			}
		
		}
		
		Collections.sort(arr1);
		Collections.sort(arr2);
		
		if (arr1.equals(arr2)) {
			System.out.println("Both lists have the same characters");
		}
		else {
			System.out.println("Both lists have different characters");
		}
				
	}

}

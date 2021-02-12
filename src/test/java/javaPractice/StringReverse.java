package javaPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import org.testng.annotations.Test;

public class StringReverse {
	
	@Test(priority=1)
	public void reverse1() {
		
	String str = "This is the string to be reversed";
	String rev = "";
	int count = str.length();
	for (int i = count-1; i >=0; i--) {
		rev = rev + str.charAt(i);	
	}
	System.out.println("The reversed string is : " + rev);
	}
	
	@Test(priority=2)
	public void reverse2() {
		String str = "This is the string to be reversed without changing word order";
		String[] str2 = str.split(" ");
		String rev = " ";
		int count = str2.length;
		for (int i = count-1; i >=0; i--) {
			rev = (rev + str2[i] + " ");
		}
		System.out.println("The reversed string is : " + rev.trim());
	}
	
	@Test(priority=3)
	public void reverse3() {
		String str = "This is the string to be reversed without using for loop";
		String rev = "";
		String[] str2 = str.split(" ");
		
		ArrayList<String> arr = new ArrayList<String>(Arrays.asList(str2));
		Collections.reverse(arr);
		System.out.println(arr);
		
		StringBuilder sb = new StringBuilder();
		for (String item : arr) {
			sb.append(item);
			sb.append(" ");
		}
		
		System.out.println(sb.toString());
	}
}

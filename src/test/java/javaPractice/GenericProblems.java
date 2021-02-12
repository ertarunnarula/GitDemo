package javaPractice;

import org.testng.annotations.Test;

public class GenericProblems {
	
	@Test
	public void swap() {
		int a = 10;
		int b = 5;
		
		a = a + b;
		b = a - b;
		a = a - b;
		
		System.out.println("The swapped values for a and b are : " + a + "," + b);
	}
	
	@Test
	public void onlyDigits() {
		String str = "1234567";

		if (str.matches("\\d+")) {
			System.out.println("String contains digits only");
		}
		else {
			System.out.println("String contains alphanumeric characters");
		}
		
	}
	
	@Test
	public void subString() {

		String str = "1234567";
		String str2 = "23";
		if(str.contains(str2)) {
			System.out.println("substring");
		}
	}

}

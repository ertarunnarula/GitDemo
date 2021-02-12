package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

import org.testng.annotations.Test;

public class Program1 {
	
	@Test (enabled = false)
	
	// Write a Java program to create a new array list, add some colors (string) and print out the collection.
	
	public void addToList() {
		
		ArrayList<String> arr = new ArrayList<String>();
		arr.add("Helsinki");
		arr.add("Nairobi");
		arr.add("Tokyo");
		arr.add("Paris");
		arr.add("Oslo");
		arr.add("Berlin");
		arr.add("Denver");
		
		System.out.println(arr);
		for (String item : arr) {
			System.out.println(item);
		}
		
	}
	
	
	@Test(enabled = false)
	
	// Write a Java program to iterate through all elements in a array list.
	
	public void iterateList() {
		
		ArrayList<String> arr = new ArrayList<String>();
		arr.add("Helsinki");
		arr.add("Nairobi");
		arr.add("Tokyo");
		arr.add("Paris");
		arr.add("Oslo");
		arr.add("Berlin");
		arr.add("Denver");
		
		Iterator<String> it = arr.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
	
	
	@Test (enabled = false)
	
	// Write a Java program to insert an element into the array list at the first position.
	
	public void insertElement() {
		
		ArrayList<String> arr = new ArrayList<String>();
		arr.add("Helsinki");
		arr.add("Nairobi");
		arr.add("Tokyo");
		arr.add("Paris");
		arr.add("Oslo");
		arr.add("Berlin");
		arr.add("Denver");
		
		arr.add(0, "Professor");
		System.out.println(arr);
		
	}
	
	
	@Test (enabled = false)
	
	// Write a Java program to retrieve an element (at a specified index) from a given array list.
	
	public void retrieveElement() {

		ArrayList<String> arr = new ArrayList<String>();
		arr.add("Helsinki");
		arr.add("Nairobi");
		arr.add("Tokyo");
		arr.add("Paris");
		arr.add("Oslo");
		arr.add("Berlin");
		arr.add("Denver");
		
		System.out.println(arr.get(3));
	}
	
	
	@Test (enabled = false)
	
	// Write a Java program to update specific array element by given element.
	
	public void updateElement() {
		
		ArrayList<String> arr = new ArrayList<String>();
		arr.add("Helsinki");
		arr.add("Nairobi");
		arr.add("Tokyo");
		arr.add("Paris");
		arr.add("Oslo");
		arr.add("Berlin");
		arr.add("Denver");
		
		arr.set(2, "Moscow");
		
		System.out.println(arr);
	}
	
	
	@Test (enabled = false)
	
	// Write a Java program to remove the third element from a array list.
	
	public void removeElement() {

		ArrayList<String> arr = new ArrayList<String>();
		arr.add("Helsinki");
		arr.add("Nairobi");
		arr.add("Tokyo");
		arr.add("Paris");
		arr.add("Oslo");
		arr.add("Berlin");
		arr.add("Denver");
		
		arr.remove(2);
		
		System.out.println(arr);
	}
	
	
	@Test (enabled = false)
	
	// Write a Java program to search an element in a array list.
	
	public void searchElement() {
		
		ArrayList<String> arr = new ArrayList<String>();
		arr.add("Helsinki");
		arr.add("Nairobi");
		arr.add("Tokyo");
		arr.add("Paris");
		arr.add("Oslo");
		arr.add("Berlin");
		arr.add("Denver");
		
		if (arr.contains("Delhi")) {
			System.out.println("Contains the element");
		}
		else {
			System.out.println("Not present !!!!");
		}
	}
	
	
	@Test (enabled = false)
	
	// Write a Java program to copy one array list into another.
	
	public void copyArrayList() {
		
		ArrayList<String> arr = new ArrayList<String>();
		arr.add("Helsinki");
		arr.add("Nairobi");
		arr.add("Tokyo");
		arr.add("Paris");
		arr.add("Oslo");
		arr.add("Berlin");
		arr.add("Denver");
		
		ArrayList<String> arr2 = new ArrayList<String>();
		arr2.add("One");
		arr2.add("Two");
		arr2.add("Three");
		arr2.add("Four");
		arr2.add("Five");
		arr2.add("Six");
		arr2.add("Seven");
		
		System.out.println("List 1 : " + arr);
		System.out.println("List 2 : " + arr2);
		Collections.copy(arr2, arr);
		System.out.println("List 1 : " + arr);
		System.out.println("List 2 : " + arr2);
		
	}
	
	
	@Test (enabled = false)
	
	// Write a Java program to sort a given array list.
	
	public void sortArrayList() {
		
		ArrayList<String> arr = new ArrayList<String>();
		arr.add("Helsinki");
		arr.add("Nairobi");
		arr.add("Tokyo");
		arr.add("Paris");
		arr.add("Oslo");
		arr.add("Berlin");
		arr.add("Denver");
		
		Collections.sort(arr);
		System.out.println(arr);
	}
	
	
	@Test (enabled = false)
	
	// Write a Java program to shuffle elements in a array list.
	
	public void shuffleArrayList() {
		
		ArrayList<String> arr = new ArrayList<String>();
		arr.add("Helsinki");
		arr.add("Nairobi");
		arr.add("Tokyo");
		arr.add("Paris");
		arr.add("Oslo");
		arr.add("Berlin");
		arr.add("Denver");
		
		Collections.shuffle(arr);
		System.out.println(arr);
	}
	
	
	@Test(enabled = false)
	
	// Write a Java program to reverse elements in a array list.
	
	public void reverse() {
		
		ArrayList<String> arr = new ArrayList<String>();
		arr.add("Helsinki");
		arr.add("Nairobi");
		arr.add("Tokyo");
		arr.add("Paris");
		arr.add("Oslo");
		arr.add("Berlin");
		arr.add("Denver");
		
		Collections.reverse(arr);
		System.out.println(arr);
	}
	
	
	@Test
	
	// Write a Java program to extract a portion of a array list.
	
	public void substring() {
		
		ArrayList<String> arr = new ArrayList<String>();
		arr.add("Helsinki");
		arr.add("Nairobi");
		arr.add("Tokyo");
		arr.add("Paris");
		arr.add("Oslo");
		arr.add("Berlin");
		arr.add("Denver");
		
		System.out.println(arr.subList(2, 5));
	}
	
	
	@Test
	
	// Write a Java program to compare two array lists.
	
	public void compareList() {
		
		ArrayList<String> arr = new ArrayList<String>();
		arr.add("Helsinki");
		arr.add("Nairobi");
		arr.add("Tokyo");
		arr.add("Paris");
		arr.add("Oslo");
		arr.add("Berlin");
		arr.add("Denver");
		
		ArrayList<String> arr2 = new ArrayList<String>();
		arr2.add("One");
		arr2.add("Two");
		arr2.add("Three");
		arr2.add("Four");
		arr2.add("Five");
		arr2.add("Six");
		arr2.add("Seven");
		
		
	}
	

}

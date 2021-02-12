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
	
	
	@Test (enabled = false)
	
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
	
	
	@Test (enabled = false)
	
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
		arr2.add("Nairobi");
		arr2.add("Two");
		arr2.add("Tokyo");
		arr2.add("Four");
		arr2.add("Five");
		arr2.add("Denver");
		arr2.add("Seven");
		
		ArrayList<String> arr3 = new ArrayList<String>();
		for (String item : arr) {
			if (arr2.contains(item)) {
				arr3.add(item);
			}
		}
		
		System.out.println(arr3);
	}
	
	
	@Test (enabled = false)
	
	// Write a Java program of swap two elements in an array list.
	
	public void swap() {
		
		ArrayList<String> arr = new ArrayList<String>();
		arr.add("One");
		arr.add("Two");
		arr.add("Three");
		arr.add("Four");
		arr.add("Five");
		arr.add("Six");
		arr.add("Seven");
		
		Collections.swap(arr, 1, 5);
		System.out.println(arr);
		
	}
	
	
	@Test(enabled = false)
	
	// Write a Java program to join two array lists.
	
	public void join() {
		
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
		
		arr.addAll(arr2);
		System.out.println(arr);
	}
	
	
	@Test(enabled = false)
	
	// Write a Java program to clone an array list to another array list.
	
	// Note : Read about why do we do typecasting
	
	public void cloneList() {
		
		ArrayList<String> arr = new ArrayList<String>();
		arr.add("Helsinki");
		arr.add("Nairobi");
		arr.add("Tokyo");
		arr.add("Paris");
		arr.add("Oslo");
		arr.add("Berlin");
		arr.add("Denver");
		
		ArrayList<String> arr2 = new ArrayList<String>();
		arr2 = (ArrayList<String>) arr.clone();
		System.out.println(arr2);
		
	}
	
	
	@Test(enabled = false)
	
	// Write a Java program to empty an array list.
	
	public void empty() {
		
		ArrayList<String> arr = new ArrayList<String>();
		arr.add("Helsinki");
		arr.add("Nairobi");
		arr.add("Tokyo");
		arr.add("Paris");
		arr.add("Oslo");
		arr.add("Berlin");
		arr.add("Denver");
		
		arr.clear();
		System.out.println(arr);
	}
	
	
	@Test(enabled = false)
	
	// Write a Java program to test an array list is empty or not.
	
	public void isEmpty() {
		
		ArrayList<String> arr = new ArrayList<String>();
		arr.add("Helsinki");
		arr.add("Nairobi");
		arr.add("Tokyo");
		arr.add("Paris");
		arr.add("Oslo");
		arr.add("Berlin");
		arr.add("Denver");
		
		if (arr.isEmpty())  {
			System.out.println("The ArrayList is empty");
		}
		else {
			System.out.println("Not empty");
		}
	}
	
	
	@Test(enabled = false)
	
	// Write a Java program to trim the capacity of an array list the current list size.
	
	public void limit() {
		
		ArrayList<String> arr = new ArrayList<String>();
		arr.add("Helsinki");
		arr.add("Nairobi");
		arr.add("Tokyo");
		arr.add("Paris");
		arr.add("Oslo");
		arr.add("Berlin");
		arr.add("Denver");
		
		arr.trimToSize();
		System.out.println(arr);
	}
	
	
	@Test(enabled = false)
	
	// Write a Java program to increase the size of an array list.
	
	public void increase() {
		
		ArrayList<String> arr = new ArrayList<String>();
		arr.add("Helsinki");
		arr.add("Nairobi");
		arr.add("Tokyo");
		arr.add("Paris");
		arr.add("Oslo");
		arr.add("Berlin");
		arr.add("Denver");
		
		arr.ensureCapacity(10);
		System.out.println(arr);
	}
	
	
	@Test(enabled = false)
	
	// Write a Java program to replace the second element of a ArrayList with the specified element.
	
	public void replace() {
		
		ArrayList<String> arr = new ArrayList<String>();
		arr.add("Helsinki");
		arr.add("Nairobi");
		arr.add("Tokyo");
		arr.add("Paris");
		arr.add("Oslo");
		arr.add("Berlin");
		arr.add("Denver");
		
		arr.set(2, "Professor");
		System.out.println(arr);
	}
	
	@Test
	
	// Write a Java program to print all the elements of a ArrayList using the position of the elements.
	
	public void print() {
		
		ArrayList<String> arr = new ArrayList<String>();
		arr.add("Helsinki");
		arr.add("Nairobi");
		arr.add("Tokyo");
		arr.add("Paris");
		arr.add("Oslo");
		arr.add("Berlin");
		arr.add("Denver");
		
		for (String item : arr) {
			System.out.println(item);
		}
	}

}

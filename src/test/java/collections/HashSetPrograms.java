package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

import org.testng.annotations.Test;

public class HashSetPrograms {
	
	@Test(enabled = false)
	
	// Write a Java program to append the specified element to the end of a hash set.
	
	public void append() {
		
		HashSet<String> hs = new HashSet<String>();
		hs.add("Helsinki");
		hs.add("Nairobi");
		hs.add("Tokyo");
		hs.add("Paris");
		hs.add("Oslo");
		hs.add("Berlin");
		hs.add("Denver");
		
		hs.add("Professor");
		System.out.println(hs);
	}
	
	
	@Test(enabled = false)
	
	// Write a Java program to iterate through all elements in a hash list.
	
	public void iterate() {
		
		HashSet<String> hs = new HashSet<String>();
		hs.add("Helsinki");
		hs.add("Nairobi");
		hs.add("Tokyo");
		hs.add("Paris");
		hs.add("Oslo");
		hs.add("Berlin");
		hs.add("Denver");
		
		for (String item : hs) {
			System.out.println(item);
		}
	}
	
	
	@Test(enabled = false)
	
	// Write a Java program to get the number of elements in a hash set.
	
	public void size() {
		
		HashSet<String> hs = new HashSet<String>();
		hs.add("Helsinki");
		hs.add("Nairobi");
		hs.add("Tokyo");
		hs.add("Paris");
		hs.add("Oslo");
		hs.add("Berlin");
		hs.add("Denver");
		
		System.out.println(hs.size());
	}
	
	
	@Test(enabled = false)
	
	// Write a Java program to empty an hash set.
	
	public void empty() {
		
		HashSet<String> hs = new HashSet<String>();
		hs.add("Helsinki");
		hs.add("Nairobi");
		hs.add("Tokyo");
		hs.add("Paris");
		hs.add("Oslo");
		hs.add("Berlin");
		hs.add("Denver");
		
		hs.clear();
		System.out.println(hs);
		
	}
	
	
	@Test(enabled = false)
	
	// Write a Java program to test a hash set is empty or not.
	
	public void isEmpty() {
		
		HashSet<String> hs = new HashSet<String>();
		hs.add("Helsinki");
		hs.add("Nairobi");
		hs.add("Tokyo");
		hs.add("Paris");
		hs.add("Oslo");
		hs.add("Berlin");
		hs.add("Denver");
		
		if (hs.isEmpty()) {
			System.out.println("Set is empty");
		}
		
		else {
			System.out.println("There are elements present in the Set");
		}
	}
	
	
	@Test(enabled = false)
	
	// Write a Java program to clone a hash set to another hash set.
	
	public void cloneSet() {
		
		HashSet<String> hs = new HashSet<String>();
		hs.add("Helsinki");
		hs.add("Nairobi");
		hs.add("Tokyo");
		hs.add("Paris");
		hs.add("Oslo");
		hs.add("Berlin");
		hs.add("Denver");
		
		HashSet<String> hs1 = new HashSet<String>();
		hs1 = (HashSet<String>) hs.clone();
		System.out.println(hs1);
	}
	
	
	@Test(enabled = false)
	
	// Write a Java program to convert a hash set to an array.
	
	public void convert() {
		
		HashSet<String> hs = new HashSet<String>();
		hs.add("Helsinki");
		hs.add("Nairobi");
		hs.add("Tokyo");
		hs.add("Paris");
		hs.add("Oslo");
		hs.add("Berlin");
		hs.add("Denver");
		
		String[] arr = new String[hs.size()];
		hs.toArray(arr);
		for (String item : arr) {
			System.out.println(item);
		}
	}
	
	
	@Test(enabled = false)
	
	// Write a Java program to convert a hash set to a List/ArrayList.
	
	public void covertToList() {
		
		HashSet<String> hs = new HashSet<String>();
		hs.add("Helsinki");
		hs.add("Nairobi");
		hs.add("Tokyo");
		hs.add("Paris");
		hs.add("Oslo");
		hs.add("Berlin");
		hs.add("Denver");
		
		System.out.println(hs);
		
		String[] arr = new String[hs.size()];
		hs.toArray(arr);
		
		ArrayList<String> list = new ArrayList<String>(Arrays.asList(arr));
		System.out.println(list);	
		
	}
	
	
	@Test(enabled = false)
	
	// Write a Java program to compare two hash set.
	
	public void compareSet() {
		
		int count=0;
		
		HashSet<String> hs = new HashSet<String>();
		hs.add("Helsinki");
		hs.add("Nairobi");
		hs.add("Tokyo");
		hs.add("Paris");
		hs.add("Oslo");
		hs.add("Berlin");
		hs.add("Denver");
		
		HashSet<String> hs1 = new HashSet<String>();
		hs1.add("One");
		hs1.add("Nairobi");
		hs1.add("Two");
		hs1.add("Three");
		hs1.add("Oslo");
		hs1.add("Berlin");
		hs1.add("Four");
		
		HashSet<String> hs2 = new HashSet<String>();
		for (String item : hs) {
			if (hs1.contains(item)) {
				hs2.add(item);
				count++;
			}

		}
		
		System.out.println(hs2 + " : " + count);
	}
	
	
	@Test
	
	// Write a Java program to remove all of the elements from a hash set.
	
	public void removeElements() {
		
		HashSet<String> hs = new HashSet<String>();
		hs.add("Helsinki");
		hs.add("Nairobi");
		hs.add("Tokyo");
		hs.add("Paris");
		hs.add("Oslo");
		hs.add("Berlin");
		hs.add("Denver");
		
		hs.removeAll(hs);
		
		System.out.println(hs);
	}

}

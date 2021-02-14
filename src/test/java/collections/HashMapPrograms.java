package collections;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

import org.testng.annotations.Test;

public class HashMapPrograms {
	
	@Test(enabled = false)
	
	// Write a Java program to associate the specified value with the specified key in a HashMap.
	
	public void HashMapSetVal() {
		
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(1, "Oslo");
		hm.put(2, "Paris");
		hm.put(3, "Tokyo");
		hm.put(4, "Nairobi");
		hm.put(5, "Rio");
		hm.put(6, "Helsinki");
		hm.put(7, "Moscow");
		
		Set<Entry<Integer, String>> entry = hm.entrySet();
		for (Entry<Integer, String> item : entry) {
			System.out.println("The key : " + item.getKey() + " has value " + ": " + item.getValue());
		}
	}
	
	
	@Test(enabled = false)
	
	// Write a Java program to count the number of key-value (size) mappings in a map.
	
	public void countMappings() {
		
		int count = 0;
		
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(1, "Oslo");
		hm.put(2, "Paris");
		hm.put(3, "Tokyo");
		hm.put(4, "Nairobi");
		hm.put(5, "Rio");
		hm.put(6, "Helsinki");
		hm.put(7, "Moscow");
		
		Set<Entry<Integer, String>> entry = hm.entrySet();
		for (Entry<Integer, String> item : entry) {
			System.out.println("The key : " + item.getKey() + " has value " + ": " + item.getValue());
			count++;
		}
		
		System.out.println(hm + " : " + count);
	}
	
	
	@Test(enabled = false)
	
	// Write a Java program to copy all of the mappings from the specified map to another map.
	
	public void copyMap() {
		
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(1, "Oslo");
		hm.put(2, "Paris");
		hm.put(3, "Tokyo");
		hm.put(4, "Nairobi");
		hm.put(5, "Rio");
		hm.put(6, "Helsinki");
		hm.put(7, "Moscow");
		
		HashMap<Integer,String> hm1 = new HashMap<Integer,String>();
		hm1 = (HashMap<Integer, String>) hm.clone();
		System.out.println(hm1);
	}
	
	
	@Test(enabled = false)
	
	// Write a Java program to remove all of the mappings from a map.
	
	public void remove() {
		
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(1, "Oslo");
		hm.put(2, "Paris");
		hm.put(3, "Tokyo");
		hm.put(4, "Nairobi");
		hm.put(5, "Rio");
		hm.put(6, "Helsinki");
		hm.put(7, "Moscow");
		
		hm.clear();
		System.out.println(hm);
	}
	
	
	@Test(enabled = false)
	
	// 	Write a Java program to check whether a map contains key-value mappings (empty) or not.
	
	public void isEmpty() {
		
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(1, "Oslo");
		hm.put(2, "Paris");
		hm.put(3, "Tokyo");
		hm.put(4, "Nairobi");
		hm.put(5, "Rio");
		hm.put(6, "Helsinki");
		hm.put(7, "Moscow");
		
		System.out.println(hm.isEmpty() ? "Yes" : "No");
	}
	
	
	@Test(enabled = false)
	
	// Write a Java program to get a shallow copy of a HashMap instance.
	
	public void copy() {
		
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(1, "Oslo");
		hm.put(2, "Paris");
		hm.put(3, "Tokyo");
		hm.put(4, "Nairobi");
		hm.put(5, "Rio");
		hm.put(6, "Helsinki");
		hm.put(7, "Moscow");
		
		HashMap<Integer, String> hm2 = new HashMap<Integer, String>();
		hm2 = (HashMap<Integer, String>) hm.clone();
		System.out.println("The cloned map is : " + hm2);
		
	}
	
	
	@Test(enabled = false)
	
	// Write a Java program to test if a map contains a mapping for the specified key.
	
	public void sub() {
		
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(1, "Oslo");
		hm.put(2, "Paris");
		hm.put(3, "Tokyo");
		hm.put(4, "Nairobi");
		hm.put(5, "Rio");
		hm.put(6, "Helsinki");
		hm.put(7, "Moscow");
		
		if (hm.containsKey("Tokyo")) {
			System.out.println("The desired key is present");
		}
		else {
			System.out.println("Key's absent");
		}
	}
	
	
	@Test(enabled = false)
	
	// Write a Java program to test if a map contains a mapping for the specified value.
	
	public void value() {
		
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(1, "Oslo");
		hm.put(2, "Paris");
		hm.put(3, "Tokyo");
		hm.put(4, "Nairobi");
		hm.put(5, "Rio");
		hm.put(6, "Helsinki");
		hm.put(7, "Moscow");
		
		if (hm.containsValue("Tokyo")) {
			System.out.println("Present");
		}
		
		else {
			System.out.println("Not Present");
		}
	}
	
	
	@Test(enabled = false)
	
	// Write a Java program to create a set view of the mappings contained in a map.
	
	public void setView() {
		
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(1, "Oslo");
		hm.put(2, "Paris");
		hm.put(3, "Tokyo");
		hm.put(4, "Nairobi");
		hm.put(5, "Rio");
		hm.put(6, "Helsinki");
		hm.put(7, "Moscow");
		
		Set<Entry<Integer, String>> entry = hm.entrySet();
		for (Entry<Integer,String> item : entry) {
			System.out.println("The Key : " + item.getKey());
			System.out.println("The Value : " + item.getValue());
			System.out.println("");
		}
	}
	
	
	@Test(enabled = false)
	
	// Write a Java program to get the value of a specified key in a map.
	
	public void valueSpecificKey() {
		
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(1, "Oslo");
		hm.put(2, "Paris");
		hm.put(3, "Tokyo");
		hm.put(4, "Nairobi");
		hm.put(5, "Rio");
		hm.put(6, "Helsinki");
		hm.put(7, "Moscow");
		
		Set<Entry<Integer,String>> entry = hm.entrySet();
		for (Entry<Integer,String> item : entry) {
			if (item.getKey() == 4) {
				System.out.println(item.getValue());
			}
		}
		
	}
	
	
	@Test(enabled = false)
	
	// Write a Java program to get a set view of the keys contained in this map.
	
	public void getKey() {
		
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(1, "Oslo");
		hm.put(2, "Paris");
		hm.put(3, "Tokyo");
		hm.put(4, "Nairobi");
		hm.put(5, "Rio");
		hm.put(6, "Helsinki");
		hm.put(7, "Moscow");
		
		Set<Entry<Integer,String>> entry = hm.entrySet();
		for (Entry<Integer,String> item : entry) {
			if (item.getValue() == "Rio") {
				System.out.println("Key : " + item.getKey());
			}
		}
	}
	
	
	@Test
	
	// Write a Java program to get a collection view of the values contained in this map.
	
	public void collectionsView() {
		
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(1, "Oslo");
		hm.put(2, "Paris");
		hm.put(3, "Tokyo");
		hm.put(4, "Nairobi");
		hm.put(5, "Rio");
		hm.put(6, "Helsinki");
		hm.put(7, "Moscow");
		
		System.out.println("Collections View  : " + hm.values());
	}

}

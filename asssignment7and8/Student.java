package asssignment7and8;

import java.util.ArrayList;
import java.util.HashMap;

public class Student {
	
	private ArrayList<String> names = new ArrayList<String>();
	private HashMap<String, String> empNames = new HashMap<String, String>();

	public void addNames() {
		names.add(0, "a");
		names.add(1, "b");
		names.add(2, "c");
		names.add(3, "d");
		names.add(4, "e");
	}
	
	public void setNames() {
		names.set(0, "Sahil");
		names.set(1, "Avdhoot");
		names.set(2, "Vivek");
		names.set(3, "Utsav");
		names.set(4, "Bhagyashree");
		
	}

	public void searchName(String name) {
		for (String i : names) {
			if (i.equals(name)) {
				System.out.println("Name Found in ArrayList");
			return;}
		}
			System.out.println("Name Not Found in ArrayList");
		
	}

	public void searchName(int index) {
		System.out.println(names.get(index));
	}

	public void printNames() {
		for (String i : names) {
		      System.out.println(i);
		    }
	}

	public void removeName(String stuName) {
		names.remove(stuName);
	}

	public void setNames1() {
		empNames.put("1a", "Sahil");
		empNames.put("2b", "Avdhoot");
		empNames.put("3c", "Vivek");
		empNames.put("4d", "Utsav");
	}
	public void printNames1() {
		System.out.println(empNames);
	}
	public void getName(String key) {
		for (String i : empNames.keySet()) {
			  System.out.println(empNames.get(key));
			  break;
			}
	}
	public void printNamesKeySet() {
		for (String i : empNames.keySet()) {
			  System.out.println(i);
			}
	}
	public void printSize() {
		System.out.println(empNames.size());
	}
	public void remove(String key) {
		empNames.remove(key);
	}	
	
}

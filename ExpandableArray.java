package week6;

import acm.program.ConsoleProgram;

public class ExpandableArray extends ConsoleProgram {
	
	public ExpandableArray() {
	array = new Object[0]; // Allows us to check length of array
	// even when no elements exist
	}
	
	public void set(int index, Object value) {
	if (index >= array.length) {
	// Create a new array that is large enough
	Object[] newArray = new Object[index + 1];
	// Copy all the existing elements into new array
	for (int i = 0; i < array.length; i++) {
	newArray[i] = array[i];
	}
	// Keep track of the new array in place of the old array
	array = newArray;
	}
	array[index] = value;
	}
	
	public Object get(int index) {
	if (index >= array.length) return null;
	return array[index];
	}
	/* Private instance variables */
	private Object[] array;
	}

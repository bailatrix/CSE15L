import java.nio.BufferOverflowException;


public class PartialIntegerListTester extends junit.framework.TestCase  {
	
	public PartialIntegerListTester(String name) {
	    super(name);
	}
	/* Test the constructor */
	public void testCtor() {
		
		try {
			// Try with instantiating the IntegerList with negative size
			IntegerList myIntList = new IntegerList(-5);
			// fail the test if negative size was allowed
			fail();
		}
		catch ( IllegalArgumentException e)	{
			// Pass the test			
		}
		
		IntegerList myIntList = new IntegerList(0);
		assertEquals(0,myIntList.size());
		
	}
	
	public void testAddAtLocation()	{
		
		// Create IntegerList of size 5
		IntegerList myIntList = new IntegerList(5);
		// The allowed index range is 0..4
		try {
			// Try adding at index 5  
			myIntList.add(5,4);
			// fail the test if you can add at index 5. 
			fail();
			
		}
		catch (IndexOutOfBoundsException e){
			// pass the test
		}
		
		for(int i=0;i<4;i++) {
			// Add elements to the list in order  0 1 2 3 
			myIntList.add(i);
		}
		// add 4 to index 2, list should have the following elements 0 1 4 3 2 
		myIntList.add(2,4);

		assertEquals(0,myIntList.get(0));
		assertEquals(1,myIntList.get(1));
		assertEquals(2,myIntList.get(3));
		assertEquals(3,myIntList.get(4));
		assertEquals(4,myIntList.get(2));
		
		
		try {
			// Try adding to a full list  
			myIntList.add(2,4);
			// Should fail the test if you can add to a full list.
			fail();
			
		}
		catch (BufferOverflowException e){
			// pass the test
		}
		

		
	}
	public void testAdd() {
		
		IntegerList myIntList = new IntegerList(5);
		
		for(int i=0;i<5;i++) {
			myIntList.add(i);
			assertEquals(i,myIntList.get(i));
		}
		
		try {
			
			myIntList.add(10);
			fail();
			
		}
		catch (BufferOverflowException e){
			// pass the test
		}
	}
	
	public void testClear() {
		
		IntegerList myIntList = new IntegerList(5);
		// Add elements to the list
		for(int i=0;i<5;i++) {
			myIntList.add(i);
		}
		// Clear the list
		myIntList.clear();
		// Check if size is 0
		assertEquals(0,myIntList.size());
	}
	
	public void testIsEmpty() {
		
		IntegerList myIntList = new IntegerList(5);
		// List will be empty right after its creation.
		assertEquals(true,myIntList.isEmpty());
		
		/// Add elements to the list
		for(int i=0;i<5;i++) {
			myIntList.add(i);
			assertEquals(false,myIntList.isEmpty());
		}
		
		// Clear the list
		myIntList.clear();
		// Check if empty
		assertEquals(true,myIntList.isEmpty());
		
		// Add elements to the list
		for(int i=0;i<5;i++) {
			myIntList.add(i);
			assertEquals(false,myIntList.isEmpty());
		}
		
		// Remove elements from index 0 to index 4
		myIntList.removeRange(0,5);
		// Check if list is empty
		assertEquals(true,myIntList.isEmpty());
		
	}
	
	public void testRemove() {
		
		IntegerList myIntList = new IntegerList(3);
		// Add elements to the list
		for(int i=0;i<3;i++) {
			myIntList.add(i);
		}
		

		try {
			// Try removing element at index 4 			
			myIntList.remove(4);
			// Should  fail the test if you can remove the element at 4.
			fail();
			
		}
		catch (IndexOutOfBoundsException e){
			// pass the test
		}
		
		assertEquals(3,myIntList.size());
		assertEquals(1,myIntList.remove(1));
		
		assertEquals(2,myIntList.size());
		assertEquals(0,myIntList.get(0));
		assertEquals(2,myIntList.get(1));
		
	
		
		
		
	}
	public void testRemoveRange() {
		
		IntegerList myIntList = new IntegerList(5);
		// Add elements to the list
		for(int i=0;i<5;i++) {
			myIntList.add(i);
		}
		
		try {
			// fromIndex>toIndex should throw exception
			myIntList.removeRange(5,1);
			fail();
			
		}
		catch (IllegalArgumentException e){
			// pass the test
		}
		
		// Remove elements from index 1 to index 3
		myIntList.removeRange(1,4);
		assertEquals(2,myIntList.size());
		assertEquals(0,myIntList.get(0));
		assertEquals(4,myIntList.get(1));
		
		try {
			
			myIntList.removeRange(0,5);
			fail();
			
		}
		catch (IndexOutOfBoundsException e){
			// pass the test
		}
		
		myIntList.clear();
		for(int i=0;i<5;i++) {
			myIntList.add(i);
		}
		// Remove elements from index 0 to index 4
		myIntList.removeRange(0,5);
		assertEquals(0,myIntList.size());	
		
	}
	
	
	public void testSet() {
		
		// This test should verify the set() function of IntegerList
				
		/* First, read the set() function under Partial/IntegerList.java
		   to understand what operations set() performs */
		
		
		// Step 1: create a new IntegerList object
		
		
		// Step 2: add some integers to the IntegerList object you created
		
		
		// Step 3: test the set() function by calling it in a try-catch block
		 
		
		// Step 4:test for IndexOutOfBoundsException also
		
		fail();		
	}
	
	public void testGet() {
		
		/* First, read the get() function under Partial/IntegerList.java
		 to understand what operations get performs */
		
		// This test should verify the get() function of IntegerList
		
		
		// Step 1: create a new IntegerList object
		
		
		// Step 2: add some integers to the IntegerList object you created
		
		
		// Step 3: test the get() function by calling it in a try-catch block
		 
		 
		// Step 4: test for IndexOutOfBoundsException also
		
		fail();	
	}
	
	public void testSize() {
		
		IntegerList myIntList = new IntegerList(5);
		assertEquals(0,myIntList.size());
		
		for(int i=0;i<5;i++) {
			myIntList.add(i);
			assertEquals(i+1,myIntList.size());

		}
		
	}
	
	
	public static void main(String args[]){
	    junit.textui.TestRunner.main(new String[] {"PartialIntegerListTester"});
	}

}

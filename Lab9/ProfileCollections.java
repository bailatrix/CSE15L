import java.util.*;

public class ProfileCollections {

	public static void main(String[] args) throws InterruptedException {

	int count = 1000000;

	// Declare your container here
	List<Integer> vectorList = new Vector<Integer>();

	// Call the garbage collector
	System.gc();

	// Start clock
	long startTime = System.nanoTime();

	// Fill the container with Integer Objects
	for (int i = 0; i <= count; i++)
		vectorList.add(new Integer(i));

	// Remove Objects as per the container behavior
	while (!vectorList.isEmpty()) {

	// Using println below, you can verify that your program works
	// Once you confirm that your program works, remove println and directly call vectorList.remove(0);
	System.out.println(vectorList.remove(0));

	}

	// End clock
	long endTime = System.nanoTime();

	// Calculate and print elapsed time
	double result = (double)(endTime - startTime)/1000000000;
	System.out.println(result);
	}
}

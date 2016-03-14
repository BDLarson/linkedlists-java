import java.util.Random;

import org.junit.Test;

import edu.hawaii.ics211.uhCollection.UhArrayList;
import edu.hawaii.ics211.uhCollection.UhSingleLinkedList;
import edu.hawaii.ics211.uhPerformance.Timer;

/**
 * Conduct an analysis of algorithms on different data structures for ICS 211.
 *
 * @author Blake Larson
 */
public class Assignment4 {

  /** A random number generator for populating the data structures. */
  private static Random r = null;


  /**
   * Conduct one heat of testing AddFirst methods on an Array List.
   *
   * @param size         The number of elements in the Array List at the start
   *                     of the test run.
   * @param measurements The number of times to run the method under test on the
   *                     data structure.
   */
  private static void measureArrayListAddFirst(final int size, final int measurements) {

    Timer timer = new Timer("Array List - AddFirst " + measurements + " items"
                          + " into a " + size + " item list");

    // Make the data structure
    UhArrayList theDataStructure = new UhArrayList(size + measurements);

    // Pre-Populate the data structure with size items.
    for (int i = 0; i < size; i++) {
      theDataStructure.addLast(r.nextLong());  // Any add method will do
    }

    // Time how long it takes to perform n actions
    timer.start();
    for (int i = 0; i < measurements; i++) {
      theDataStructure.addFirst(r.nextLong());  // The method under test
    }
    timer.stop();

    System.out.println(timer.getDescription() + " = " + timer.getDurationNs());

    theDataStructure = null;
  }
  
  private static void measureArrayListAddLast(final int size, final int measurements) {

	  Timer timer = new Timer("Array List - AddFirst " + measurements + " items"
			  				+ " into a " + size + " item list");

	  // Make the data structure
	  UhArrayList theDataStructure = new UhArrayList(size + measurements);

	  // Pre-Populate the data structure with size items.
	  for (int i = 0; i < size; i++) {
		  theDataStructure.addLast(r.nextLong());  // Any add method will do
	  }

	  // Time how long it takes to perform n actions
	  timer.start();
	  for (int i = 0; i < measurements; i++) {
		  theDataStructure.addLast(i);  // The method under test
	  }
	  timer.stop();

	  System.out.println(timer.getDescription() + " = " + timer.getDurationNs());

	  theDataStructure = null;
  }

  private static void measureArrayListGet(final int size, final int measurements) {

	  Timer timer = new Timer("Array List - AddFirst " + measurements + " items"
			  				+ " into a " + size + " item list");

	  // Make the data structure
	  UhArrayList theDataStructure = new UhArrayList(size + measurements);

	  // Pre-Populate the data structure with size items.
	  for (int i = 0; i < size; i++) {
		  theDataStructure.addLast(r.nextLong());  // Any add method will do
	  }

	  // Time how long it takes to perform n actions
	  timer.start();
	  for (int i = 0; i < measurements; i++) {
		  theDataStructure.get(i);  // The method under test
	  }
	  timer.stop();

	  System.out.println(timer.getDescription() + " = " + timer.getDurationNs());

	  theDataStructure = null;
  }

  private static void measureLinkedListAddFirst(final int size, final int measurements) {

	  Timer timer = new Timer("Single-Linked List - AddFirst " + measurements + " items"
			  + " into a " + size + " item list");

	  // Make the data structure
	  UhSingleLinkedList<Integer> theDataStructure = new UhSingleLinkedList<Integer>();

	  // Pre-Populate the data structure with size items.
	  for (int i = 0; i < size; i++) {
		  theDataStructure.addFirst((int)r.nextLong());  // Any add method will do
	  }

	  // Time how long it takes to perform n actions
	  timer.start();
	  for (int i = 0; i < measurements; i++) {
		  theDataStructure.addFirst(i);  // The method under test
	  }
	  timer.stop();

	  System.out.println(timer.getDescription() + " = " + timer.getDurationNs());

	  theDataStructure = null;
  } 
  
  private static void measureLinkedListAddAfter(final int size, final int measurements) {

	  Timer timer = new Timer("Single-Linked List - AddFirst " + measurements + " items"
			  + " into a " + size + " item list");

	  // Make the data structure
	  UhSingleLinkedList<Integer> theDataStructure = new UhSingleLinkedList<Integer>();

	  // Pre-Populate the data structure with size items.
	  for (int i = 0; i < size; i++) {
		  theDataStructure.addFirst((int)r.nextLong());  // Any add method will do
	  }

	  // Time how long it takes to perform n actions
	  timer.start();
	  for (int i = size-measurements; i < size; i++) {
		  theDataStructure.addAfter(theDataStructure.getNode(i), (int)r.nextLong());  // The method under test
	  }
	  timer.stop();

	  System.out.println(timer.getDescription() + " = " + timer.getDurationNs());

	  theDataStructure = null;
  } 

  private static void measureLinkedListGet(final int size, final int measurements) {

	  Timer timer = new Timer("Single-Linked List - AddFirst " + measurements + " items"
			  + " into a " + size + " item list");

	  // Make the data structure
	  UhSingleLinkedList<Integer> theDataStructure = new UhSingleLinkedList<Integer>();

	  // Pre-Populate the data structure with size items.
	  for (int i = 0; i < size; i++) {
		  theDataStructure.addFirst((int)r.nextLong());  // Any add method will do
	  }

	  // Time how long it takes to perform n actions
	  timer.start();
	  for (int i = size-measurements; i < size; i++) {
		  theDataStructure.get(i);  // The method under test
	  }
	  timer.stop();

	  System.out.println(timer.getDescription() + " = " + timer.getDurationNs());

	  theDataStructure = null;
  } 

  @Test
  public void testArrayListAddFirst() {
    r = new Random();
    r.setSeed(12345678);  // Adds some consistency to repeated runs.

    System.out.println("Data Structure:  Array List   --   Method:  AddFirst");
    measureArrayListAddFirst(1000, 1000);
    measureArrayListAddFirst(2000, 1000);
    measureArrayListAddFirst(3000, 1000);
    measureArrayListAddFirst(4000, 1000);
    measureArrayListAddFirst(5000, 1000);
    measureArrayListAddFirst(6000, 1000);
    measureArrayListAddFirst(7000, 1000);
    measureArrayListAddFirst(8000, 1000);
    measureArrayListAddFirst(9000, 1000);
    measureArrayListAddFirst(10000, 1000);
    measureArrayListAddFirst(20000, 1000);
    measureArrayListAddFirst(30000, 1000);
    measureArrayListAddFirst(40000, 1000);
    measureArrayListAddFirst(50000, 1000);
    measureArrayListAddFirst(60000, 1000);
    measureArrayListAddFirst(70000, 1000);
    measureArrayListAddFirst(80000, 1000);
    measureArrayListAddFirst(90000, 1000);
    measureArrayListAddFirst(100000, 1000);
    measureArrayListAddFirst(200000, 1000);
    measureArrayListAddFirst(300000, 1000);
    measureArrayListAddFirst(400000, 1000);
    measureArrayListAddFirst(500000, 1000);
    measureArrayListAddFirst(600000, 1000);
    measureArrayListAddFirst(700000, 1000);
    measureArrayListAddFirst(800000, 1000);
    measureArrayListAddFirst(900000, 1000);
    measureArrayListAddFirst(1000000, 1000);
  }

  @Test
  public void testArrayListAddLast() {
	    r = new Random();
	    r.setSeed(12345678);  // Adds some consistency to repeated runs.

	    System.out.println("Data Structure:  Array List   --   Method:  AddLast");
	    measureArrayListAddLast(1000, 1000);
	    measureArrayListAddLast(2000, 1000);
	    measureArrayListAddLast(3000, 1000);
	    measureArrayListAddLast(4000, 1000);
	    measureArrayListAddLast(5000, 1000);
	    measureArrayListAddLast(6000, 1000);
	    measureArrayListAddLast(7000, 1000);
	    measureArrayListAddLast(8000, 1000);
	    measureArrayListAddLast(9000, 1000);
	    measureArrayListAddLast(10000, 1000);
	    measureArrayListAddLast(20000, 1000);
	    measureArrayListAddLast(30000, 1000);
	    measureArrayListAddLast(40000, 1000);
	    measureArrayListAddLast(50000, 1000);
	    measureArrayListAddLast(60000, 1000);
	    measureArrayListAddLast(70000, 1000);
	    measureArrayListAddLast(80000, 1000);
	    measureArrayListAddLast(90000, 1000);
	    measureArrayListAddLast(100000, 1000);
	    measureArrayListAddLast(200000, 1000);
	    measureArrayListAddLast(300000, 1000);
	    measureArrayListAddLast(400000, 1000);
	    measureArrayListAddLast(500000, 1000);
	    measureArrayListAddLast(600000, 1000);
	    measureArrayListAddLast(700000, 1000);
	    measureArrayListAddLast(800000, 1000);
	    measureArrayListAddLast(900000, 1000);
	    measureArrayListAddLast(1000000, 1000); 
  	}

  @Test
  public void testArrayListGet() {
	  r = new Random();
	    r.setSeed(12345678);  // Adds some consistency to repeated runs.

	    System.out.println("Data Structure:  Array List   --   Method:  Get");
	    measureArrayListGet(1000, 1000);
	    measureArrayListGet(2000, 1000);
	    measureArrayListGet(3000, 1000);
	    measureArrayListGet(4000, 1000);
	    measureArrayListGet(5000, 1000);
	    measureArrayListGet(6000, 1000);
	    measureArrayListGet(7000, 1000);
	    measureArrayListGet(8000, 1000);
	    measureArrayListGet(9000, 1000);
	    measureArrayListGet(10000, 1000);
	    measureArrayListGet(20000, 1000);
	    measureArrayListGet(30000, 1000);
	    measureArrayListGet(40000, 1000);
	    measureArrayListGet(50000, 1000);
	    measureArrayListGet(60000, 1000);
	    measureArrayListGet(70000, 1000);
	    measureArrayListGet(80000, 1000);
	    measureArrayListGet(90000, 1000);
	    measureArrayListGet(100000, 1000);
	    measureArrayListGet(200000, 1000);
	    measureArrayListGet(300000, 1000);
	    measureArrayListGet(400000, 1000);
	    measureArrayListGet(500000, 1000);
	    measureArrayListGet(600000, 1000);
	    measureArrayListGet(700000, 1000);
	    measureArrayListGet(800000, 1000);
	    measureArrayListGet(900000, 1000);
	    measureArrayListGet(1000000, 1000); 
  }

  @Test
  public void testLinkedListAddFirst() {
	  r = new Random();
	    r.setSeed(12345678);  // Adds some consistency to repeated runs.

	    System.out.println("Data Structure:  Single-Linked List   --   Method:  AddFirst");
	    measureLinkedListAddFirst(1000, 1000);
	    measureLinkedListAddFirst(2000, 1000);
	    measureLinkedListAddFirst(3000, 1000);
	    measureLinkedListAddFirst(4000, 1000);
	    measureLinkedListAddFirst(5000, 1000);
	    measureLinkedListAddFirst(6000, 1000);
	    measureLinkedListAddFirst(7000, 1000);
	    measureLinkedListAddFirst(8000, 1000);
	    measureLinkedListAddFirst(9000, 1000);
	    measureLinkedListAddFirst(10000, 1000);
	    measureLinkedListAddFirst(20000, 1000);
	    measureLinkedListAddFirst(30000, 1000);
	    measureLinkedListAddFirst(40000, 1000);
	    measureLinkedListAddFirst(50000, 1000);
	    measureLinkedListAddFirst(60000, 1000);
	    measureLinkedListAddFirst(70000, 1000);
	    measureLinkedListAddFirst(80000, 1000);
	    measureLinkedListAddFirst(90000, 1000);
	    measureLinkedListAddFirst(100000, 1000);
	    measureLinkedListAddFirst(200000, 1000);
	    measureLinkedListAddFirst(300000, 1000);
	    measureLinkedListAddFirst(400000, 1000);
	    measureLinkedListAddFirst(500000, 1000);
	    measureLinkedListAddFirst(600000, 1000);
	    measureLinkedListAddFirst(700000, 1000);
	    measureLinkedListAddFirst(800000, 1000);
	    measureLinkedListAddFirst(900000, 1000);
	    measureLinkedListAddFirst(1000000, 1000);   
	    }

  @Test
  public void testLinkedListAddAfter() {
	  r = new Random();
	    r.setSeed(12345678);  // Adds some consistency to repeated runs.

	    System.out.println("Data Structure:  Single-Linked List   --   Method:  AddAfter");
	    measureLinkedListAddAfter(1000, 1000);
	    measureLinkedListAddAfter(2000, 1000);
	    measureLinkedListAddAfter(3000, 1000);
	    measureLinkedListAddAfter(4000, 1000);
	    measureLinkedListAddAfter(5000, 1000);
	    measureLinkedListAddAfter(6000, 1000);
	    measureLinkedListAddAfter(7000, 1000);
	    measureLinkedListAddAfter(8000, 1000);
	    measureLinkedListAddAfter(9000, 1000);
	    measureLinkedListAddAfter(10000, 1000);
	    measureLinkedListAddAfter(20000, 1000);
	    measureLinkedListAddAfter(30000, 1000);
	    measureLinkedListAddAfter(40000, 1000);
	    measureLinkedListAddAfter(50000, 1000);
	    measureLinkedListAddAfter(60000, 1000);
	    measureLinkedListAddAfter(70000, 1000);
	    measureLinkedListAddAfter(80000, 1000);
	    measureLinkedListAddAfter(90000, 1000);
	    measureLinkedListAddAfter(100000, 1000);
	    measureLinkedListAddAfter(200000, 1000);
	    measureLinkedListAddAfter(300000, 1000);
	    measureLinkedListAddAfter(400000, 1000);
	    measureLinkedListAddAfter(500000, 1000);
	    measureLinkedListAddAfter(600000, 1000);
	    measureLinkedListAddAfter(700000, 1000);
	    measureLinkedListAddAfter(800000, 1000);
	    measureLinkedListAddAfter(900000, 1000);
	    measureLinkedListAddAfter(1000000, 1000);   
	    }

  @Test
  public void testLinkedListGet() {
	  r = new Random();
	    r.setSeed(12345678);  // Adds some consistency to repeated runs.

	    System.out.println("Data Structure:  Single-Linked List   --   Method:  Get");
	    measureLinkedListGet(1000, 1000);
	    measureLinkedListGet(2000, 1000);
	    measureLinkedListGet(3000, 1000);
	    measureLinkedListGet(4000, 1000);
	    measureLinkedListGet(5000, 1000);
	    measureLinkedListGet(6000, 1000);
	    measureLinkedListGet(7000, 1000);
	    measureLinkedListGet(8000, 1000);
	    measureLinkedListGet(9000, 1000);
	    measureLinkedListGet(10000, 1000);
	    measureLinkedListGet(20000, 1000);
	    measureLinkedListGet(30000, 1000);
	    measureLinkedListGet(40000, 1000);
	    measureLinkedListGet(50000, 1000);
	    measureLinkedListGet(60000, 1000);
	    measureLinkedListGet(70000, 1000);
	    measureLinkedListGet(80000, 1000);
	    measureLinkedListGet(90000, 1000);
	    measureLinkedListGet(100000, 1000);
	    measureLinkedListGet(200000, 1000);
	    measureLinkedListGet(300000, 1000);
	    measureLinkedListGet(400000, 1000);
	    measureLinkedListGet(500000, 1000);
	    measureLinkedListGet(600000, 1000);
	    measureLinkedListGet(700000, 1000);
	    measureLinkedListGet(800000, 1000);
	    measureLinkedListGet(900000, 1000);
	    measureLinkedListGet(1000000, 1000);   
	    }
}

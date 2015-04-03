package linkedLists;

import static org.junit.Assert.*;

import org.junit.Test;

public class ListTest {

	@Test
	public void testEquals(){
		List first = new List(0);
		List second = new List(0);
		for(int i=1; i<12; i++){
			first.appendToTail(i);
			second.appendToTail(i);
		}
		
		assertTrue("same linked lists", first.isEqual(second));
		assertTrue("same linked lists, different order", second.isEqual(first));
		first.appendToTail(2);
		assertFalse("one longer than the other", first.isEqual(second));
		second.appendToTail(3);

		assertFalse("same length but different lists", second.isEqual(first));
	}
	
	@Test
	public void testConstructArr(){
		int[] arr = {1,2,3,2,1};
		List list1 = new List(arr);
		List list2 = new List(1);
		list2.appendToTail(2);
		list2.appendToTail(3);
		list2.appendToTail(2);
		list2.appendToTail(1);

		assertTrue("same lists", list2.isEqual(list1));
		
	}
	
	@Test
	public void testAppendToTail() {
		List test = new List(0);
		test.appendToTail(1);
		test.appendToTail(2);
		test.appendToTail(1);
		assertEquals("first added correctly", test.next.data, 1);
		assertEquals("first added correctly", test.next.next.data, 2);
		assertEquals("first added correctly", test.next.next.next.data, 1);
	}

	@Test
	public void testRemoveDuplicates() {
		List test = new List(0);
		test.appendToTail(2);
		test.appendToTail(3);
		test.appendToTail(2);
		test.appendToTail(5);
		test.appendToTail(1);
		test.appendToTail(3);
		test.appendToTail(1);
		test.removeDuplicates();
		List test2 = new List(0);
		test2.appendToTail(2);
		test2.appendToTail(3);
		test2.appendToTail(5);
		test2.appendToTail(1);

		assertTrue("removed, should be equal", test.isEqual(test2));
	}
	@Test
	public void testRemoveDuplicatesLessMem() {
		List test = new List(0);
		test.appendToTail(0);
		test.appendToTail(3);
		test.appendToTail(2);
		test.appendToTail(5);
		test.appendToTail(1);
		test.appendToTail(3);
		test.appendToTail(1);
		test.removeDuplicatesLessMem();
		List test2 = new List(0);
		test2.appendToTail(3);
		test2.appendToTail(2);
		test2.appendToTail(5);
		test2.appendToTail(1);
		test2.printList();
		test.printList();
		assertTrue("removed, should be equal", test.isEqual(test2));
	}
}

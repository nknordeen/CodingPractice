package linkedLists;

import static org.junit.Assert.*;

import org.junit.Test;

public class ListPracticeTest {

	@Test
	public void testEquals(){
		ListPractice first = new ListPractice(0);
		ListPractice second = new ListPractice(0);
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
		ListPractice list1 = new ListPractice(arr);
		ListPractice list2 = new ListPractice(1);
		list2.appendToTail(2);
		list2.appendToTail(3);
		list2.appendToTail(2);
		list2.appendToTail(1);

		assertTrue("same lists", list2.isEqual(list1));
		
	}
	
	@Test
	public void testAppendToTail() {
		ListPractice test = new ListPractice(0);
		test.appendToTail(1);
		test.appendToTail(2);
		test.appendToTail(1);
		assertEquals("first added correctly", test.next.data, 1);
		assertEquals("first added correctly", test.next.next.data, 2);
		assertEquals("first added correctly", test.next.next.next.data, 1);
	}

	@Test
	public void testRemoveDuplicates() {
		ListPractice test = new ListPractice(0);
		test.appendToTail(2);
		test.appendToTail(3);
		test.appendToTail(2);
		test.appendToTail(5);
		test.appendToTail(1);
		test.appendToTail(3);
		test.appendToTail(1);
		test.removeDuplicates();
		ListPractice test2 = new ListPractice(0);
		test2.appendToTail(2);
		test2.appendToTail(3);
		test2.appendToTail(5);
		test2.appendToTail(1);

		assertTrue("removed, should be equal", test.isEqual(test2));
	}
	@Test
	public void testRemoveDuplicatesLessMem() {
		ListPractice test = new ListPractice(0);
		test.appendToTail(0);
		test.appendToTail(3);
		test.appendToTail(2);
		test.appendToTail(5);
		test.appendToTail(1);
		test.appendToTail(3);
		test.appendToTail(1);
		test.removeDuplicatesLessMem();
		ListPractice test2 = new ListPractice(0);
		test2.appendToTail(3);
		test2.appendToTail(2);
		test2.appendToTail(5);
		test2.appendToTail(1);
		test2.printList();
		test.printList();
		assertTrue("removed, should be equal", test.isEqual(test2));
	}
}

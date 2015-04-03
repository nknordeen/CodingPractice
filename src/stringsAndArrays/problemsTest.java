package stringsAndArrays;

import static org.junit.Assert.*;

import org.junit.Test;

public class problemsTest {

	@Test
	public void testHasUniqueChars() {
		assertTrue("test 1 empty string", problems.hasUniqueChars(""));
		assertTrue("test 2 a unique string: 'asdfghjkl;342'", problems.hasUniqueChars("asdfghjkl;342"));
		assertFalse("test 3 non unique string: 'aabcd'", problems.hasUniqueChars("aabcd"));
		assertFalse("test 4 non unique string: 'abbcd'", problems.hasUniqueChars("abbcd"));
		assertFalse("test 5 non unique string: 'abcdd'", problems.hasUniqueChars("abcdd"));
	}
	@Test
	public void testNoNewStructuresUniqueChars() {
		assertTrue("test 1 empty string", problems.hasUniqueChars(""));
		assertTrue("test 2 a unique string: 'asdfghjkl;342'", problems.hasUniqueChars("asdfghjkl;342"));
		assertFalse("test 3 non unique string: 'aabcd'", problems.hasUniqueChars("aabcd"));
		assertFalse("test 4 non unique string: 'abbcd'", problems.hasUniqueChars("abbcd"));
		assertFalse("test 5 non unique string: 'abcdd'", problems.hasUniqueChars("abcdd"));
	}

}

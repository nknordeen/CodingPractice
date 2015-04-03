package stringsAndArrays;

import static org.junit.Assert.*;

import org.junit.Test;

public class DoubleArrayPracticeTest {

	@Test
	public void testReplaceZeros() {
		int[][] test = { {1,2,0,4,1}, 
						 {5,6,7,8,4},
						 {9,0,1,2,3} };
		int[][] solution = { {0,0,0,0,0}, 
							 {5,0,0,8,4},
							 {0,0,0,0,0} };
		DoubleArrayPractice.replaceZeros(test);
		for(int i=0; i<test.length; i++){
			for(int j=0; j<test[0].length; j++){
				System.out.println(test[i][j]);
				if(test[i][j] != solution[i][j]){
					fail("weren't equal");
				}
			}
		}
		assertEquals("were equal", 1, 1);
	}

}

package stringsAndArrays;

import java.util.HashMap;


public class ArrayPractice {
	
	/**
	 * Write an algorithm such that if an element in an m x n matrix is 0 it's entire row and column are set to 0
	 * @param arr - 2D integer array
	 */
	public static void replaceZeros(int[][] arr){
		if(arr==null){
			return;
		}
		RowsAndColumns locationsOfZeros = new RowsAndColumns();

		for(int i=0; i<arr.length; i++){
			for(int j=0; j<arr[0].length; j++){
				if(arr[i][j] == 0){
					locationsOfZeros.add(i, j);
				}
			}
		}
		for(int row: locationsOfZeros.rows){
			for(int j=0; j<arr[0].length; j++){
				arr[row][j] = 0;
			}
		}
		for(int column: locationsOfZeros.columns){
			for(int i=0; i < arr.length; i++){
				arr[i][column] = 0;
			}
		}
	}
	
	/**
	 * Check to see if a given string has unique characters, ie there are no repeats
	 * in the string.
	 * @param str
	 * @return
	 */
	public static boolean hasUniqueChars(String str){
		int strLength = str.length();
		if(strLength <= 1){
			return true;
		}
		HashMap<Character, Boolean> lookUp = new HashMap<Character, Boolean>();
		for(int i=0; i<strLength; i++){
			char index = str.charAt(i);
			if(lookUp.get(index) != null){
				return false;
			}
			lookUp.put(index, true);
		}
		
		return true;
	}
	
	/**
	 * Check to see if the string given has unique characters
	 * but does not create any new data structures
	 * @param str
	 * @return
	 */
	public static boolean noNewStructuresUniqueChars(String str){
		
		return true;
	}
}


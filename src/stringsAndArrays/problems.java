package stringsAndArrays;

import java.util.HashMap;

public class problems {
	
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

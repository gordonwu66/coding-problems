/* With assumptions that the String is ASCII with a maximum of 128 possible
 * unique characters */

public class UniqueStringSol {
	
	boolean isUniqueChars(String str) {
		if(str.length() > 128) return false;
		
		boolean[] charSet = new boolean[128];
		for(int i = 0; i < str.length(); i++) {
			int val = str.charAt(i);
			if (charSet[val]) { 
				// Found this char already in the String
				return false;
			}
			charSet[val] = true;
		}
		return true;
	}
}

/* Time complexity is O(n), where n is the length of the string. Space
 * complexity is O(1). */
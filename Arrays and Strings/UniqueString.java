/* Implement an algorithm to determine if a string has all unique characters.
 * What if you can not use additional data structures? */

public class UniqueString {
	
	public static boolean hasUniqueCharacters(String str) {
		char[] chars = str.toCharArray();
		
		for(int i = 0; i < chars.length; i++) {
			for(int j = i; j < chars.length; j++) {
				if(i != j && chars[i] == chars[j]) {
					return false;
				}
			}
		}
		
		return true;
	}
}

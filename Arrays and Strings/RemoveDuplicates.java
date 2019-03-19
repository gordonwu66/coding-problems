/* Design an algorithm and write code to remove the duplicate characters in 
 * a string without using any additional buffer NOTE: One or two additional 
 * variables are fine An extra copy of the array is not. */

public class RemoveDuplicates {
	
	public static String removeDuplicates(String str) {
		
		char[] chars = str.toCharArray();
		char[] noduplicates = new char[chars.length];
		int currIndex = 0;
		
		for(int i = 0; i < chars.length; i++) {
			
			boolean alreadyExists = false;
			for(int j = 0; j < currIndex; j++) {
				if(noduplicates[j] == chars[i]) {
					alreadyExists = true;
				}
			}
			if(!alreadyExists) {
				noduplicates[currIndex] = chars[i];
				currIndex++;
			}
		}
		return new String(noduplicates);
	}	
}

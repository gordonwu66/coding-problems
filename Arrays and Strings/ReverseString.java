/* Returns a reversed string */
public class ReverseString {
	
	public static String reverseString(String str) {
		
		char[] chars = str.toCharArray();
		char[] reverse = new char[chars.length];
		int currIndex = 0;
		
		for(int i = chars.length - 1; i >= 0; i--) {
			reverse[currIndex] = chars[i];
			currIndex++;
		}
		return new String(reverse);
	}
}

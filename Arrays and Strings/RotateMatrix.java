/* Given an NxN matrix, write a method to rotate the image by 90 degrees. Can
 * this be done in place? */
public class RotateMatrix {
	
	public static int[][] rotateMatrix(int[][] matrix) {
		
		if(matrix.length != matrix[0].length) {
			return null;
		}
		
		int size = matrix.length;
		int[][] rotated = new int[size][size];
		int colToFill = matrix[0].length - 1;
		
		for(int row = 0; row < size; row++) {
			for(int col = 0; col < size; col++) {
				rotated[col][colToFill] = matrix[row][col];
			}
			colToFill--;
		}
		return rotated;
	}
}

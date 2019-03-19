import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* Write an algorithm such that if an element in an MxM matrix is 0, its 
 * entire row and column are set to zero */

public class MatrixWithZeroElement {
	
	public static void zeroMatrix(int[][] matrix) {
		Map<Integer, Integer> zeroes = new HashMap<Integer, Integer>();
		
		for(int row = 0; row < matrix.length; row++) {
			for(int col = 0; col < matrix[0].length; col++) {
				if (matrix[row][col] == 0) {
					zeroes.put(row, col);
				}
			}
		}
		
		Set<Integer> zeroRows = zeroes.keySet();
		
		for(Integer i : zeroRows) {
			for(int row = 0; row < matrix.length; row++) {
				matrix[row][zeroes.get(i)] = 0;
			}
			for(int col = 0; col < matrix[0].length; col++) {
				matrix[i][col] = 0;
			}
		}
	}
}

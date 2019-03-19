
public class Driver {
	
	public static String matrixString(int[][] matrix) {
		String toReturn = "";
		for(int i = 0; i < matrix.length; i++) {
			for(int j = 0; j < matrix[0].length; j++) {
				toReturn += matrix[i][j];
			}
			toReturn += "\n";
		}
		return toReturn;
	}

	public static void main(String[] args) {
		
		// unique string 
		String str = "hello world";
		System.out.println(UniqueString.hasUniqueCharacters(str));
		
		// remove duplicates
		System.out.println(RemoveDuplicates.removeDuplicates(str));
		
		// reverse string
		System.out.println(ReverseString.reverseString(str));
		
		// zero matrix
		int[][] matrix = new int[3][3];
		matrix[0][0] = 0;
		matrix[0][1] = 1;
		matrix[0][2] = 2;
		matrix[1][0] = 3;
		matrix[1][1] = 4;
		matrix[1][2] = 5;
		matrix[2][0] = 6;
		matrix[2][1] = 7;
		matrix[2][2] = 8;
		System.out.println(matrixString(matrix));
		MatrixWithZeroElement.zeroMatrix(matrix);
		System.out.println(matrixString(matrix));
		
		// rotate matrix
		int[][] rotatedMatrix = RotateMatrix.rotateMatrix(matrix);
		System.out.println(matrixString(rotatedMatrix));

	}

}

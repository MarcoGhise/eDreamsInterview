package it.edreams.matrix;

public class Matrix {

	/*
	 * Output has to be: 1 A2 5B5 76Q B8N NK3 RB 1 as a result
	 */
	
	String[][] matrix = {
      {"1", "A", "5", "7", "B", "N"},
      {"2", "B", "6", "8", "K", "R" },
      {"5", "Q", "N", "3", "B", "1" }
};
	
	public StringBuilder calculate()
	{
		StringBuilder result = new StringBuilder();	
		
		for (int row = 0; row < matrix.length; row++)
			matrix[row] =  paddingArray(matrix[row], row);
	
		for (int column = 0; column < matrix[0].length; column++)
		{			
			for (int row = 0; row < matrix.length; row++)
				{
				if (matrix[row][column] != null) 
				 result.append(matrix[row][column]);			 
				}
			
		result.append(" ");
		}
		
		
		return result;
	}
	
  public String[] paddingArray(String[] arrayRow, int row)
  {
		
		String newarr[] = new String[arrayRow.length+matrix.length-1];
		
		for (int i = 0; i<arrayRow.length; i++ ) {
			newarr[i+row]=arrayRow[i];
		}

		return newarr;
  }
  
  public static void main(String[] args) {
		Matrix matrix = new Matrix();

		System.out.println(matrix.calculate().toString());
	}
}

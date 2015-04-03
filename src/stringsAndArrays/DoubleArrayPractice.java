package stringsAndArrays;


public class DoubleArrayPractice {
	
	
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
}


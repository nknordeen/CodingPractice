package stringsAndArrays;

import java.util.ArrayList;

public class RowsAndColumns{
	ArrayList<Integer> rows;
	ArrayList<Integer> columns;

	public RowsAndColumns(){
		this.rows = new ArrayList<Integer>();
		this.columns = new ArrayList<Integer>();
	}
	
	public void add(int row, int column){
		if(this.rows.indexOf(row) == -1){
			this.rows.add(row);
		}
		if(this.columns.indexOf(column) == -1){
			this.columns.add(column);
		}
	}


}
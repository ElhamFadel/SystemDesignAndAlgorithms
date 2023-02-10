package iterator;

import java.util.Iterator;

public class Matrix<T> implements Iterator<T>{

	private int row;
	private int col;
	private T[][] matrix;
	int index;
	
	@SuppressWarnings("unchecked")
	public Matrix(int row, int col) {
		this.row = row;
		this.col = col;
		matrix = (T[][])new Object[row][col];
	}
	
	public Iterator<T> getIterator(){
		index = -1;
		return this;
	}
	
	public void setItem(T t, int i, int j){
		matrix[i][j] = t;
	}
	
	public T getItem(int i, int j){
		return matrix[i][j];
	}
	
	public int getRow(){
		return row;
	}
	
	public int getColumn(){
		return col;
	}

	public static void main(String[] args){
		Matrix<Integer> m = new Matrix<>(3,5);
		
		for(int i=0;i<m.getRow(); i++){
			
			for(int j=0; j<m.getColumn(); j++){
				m.setItem(i*j, i, j);
			}
		}

		Iterator<Integer> iter = m.getIterator();
		while(iter.hasNext()){
			System.out.println(iter.next());
		}
	}

	@Override
	public boolean hasNext() {
		return index < col*row-1;
	}

	@Override
	public T next() {
		if(this.hasNext()){
			index++;
			return this.getItem(index/col, index%col);
		}
		return null;
	}
}

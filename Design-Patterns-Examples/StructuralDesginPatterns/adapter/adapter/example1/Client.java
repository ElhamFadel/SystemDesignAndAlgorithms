package adapter.example1;

public class Client {
	private ArraySorter sorter;
	
	public void setSorter(ArraySorter sorter){
		this.sorter = sorter;
	}
	
	public int[] process(int[] items){
		// do something with items
		int[] sortedItems = sorter.sort(items);
		return sortedItems;
	}
}

package adapter.example1;

import java.util.Collections;
import java.util.List;

public class ListSorter {
	public List<Integer> sort(List<Integer> items){
		System.out.println("This is the list sorter");
		Collections.sort(items);
		return items;
	}
}

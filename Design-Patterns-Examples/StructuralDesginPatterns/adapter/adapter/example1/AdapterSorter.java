package adapter.example1;

import java.util.ArrayList;
import java.util.List;

public class AdapterSorter extends ArraySorter{

	ListSorter listSorter;
	
	public AdapterSorter() {
		listSorter = new ListSorter();
	}
	
	@Override
	public int[] sort(int[] numbers) {
		List<Integer> list1 =new ArrayList<>();
		for(int n: numbers)
			list1.add(n);
		
		List<Integer> outputList = listSorter.sort(list1);
		
		int[] outputArr = new int[outputList.size()];
		for(int i=0; i<outputList.size(); i++){
			outputArr[i]= outputList.get(i);
		}
		
		return outputArr;
	}

}

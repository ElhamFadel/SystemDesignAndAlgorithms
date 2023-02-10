package adapter.example1;

public class Main {

	public Main() {
		
	
		
		
		Client c = new Client();
		int[] numbers = {9,2,6,4,7};
		c.setSorter(new AdapterSorter());
		int[] output = c.process(numbers);
		for(int o: output){
			System.out.println(o);
		}
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new Main();
	}

}

package template;

public class Main {

	public static void main(String[] args) {

		String text = "My name is Ahmed. I bought this coat last year. it has many defects and useless";
		
		MyTextProcessor p = new MyTextProcessor();
		p.processText(text);
		
	}

}

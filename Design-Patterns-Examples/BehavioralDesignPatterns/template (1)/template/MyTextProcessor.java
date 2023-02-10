package template;

public class MyTextProcessor extends TextProcessor{

	@Override
	public String[] tokenize(String text) {
		System.out.println("tokenize");
		return null;
	}

	@Override
	public String[] removeStopwords(String[] tokens) {
		System.out.println("removeStopwords");
		return null;
	}

	@Override
	public String[] stem(String[] tokens) {
		System.out.println("stem");
		return null;
	}

	@Override
	public String applySentimentAnalysis(String[] tokens) {
		System.out.println("applySentimentAnalysis");
		return null;
	}

	
}

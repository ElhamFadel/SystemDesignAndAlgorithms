package template;

public abstract class TextProcessor {

	public abstract String[] tokenize(String text);
	public abstract String[] removeStopwords(String[] tokens);
	public abstract String[] stem(String[] tokens);
	public abstract String applySentimentAnalysis(String[] tokens);
	
    final public String processText(String inputText) {
		String[] tokens = tokenize(inputText);
		String[] tokensWithoutStopwords = removeStopwords(tokens);
		String[] stems = stem(tokensWithoutStopwords);
		return applySentimentAnalysis(stems);
	}
}

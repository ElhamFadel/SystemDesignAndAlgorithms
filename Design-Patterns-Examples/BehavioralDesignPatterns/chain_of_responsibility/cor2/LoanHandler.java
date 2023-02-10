package cor2;

public abstract class LoanHandler {

	LoanHandler successor;
	
	public void setSuccessor(LoanHandler successor){
		this.successor = successor;
	}
	
	public LoanHandler getSuccessor(){
		return this.successor;
	}
	
	public abstract boolean handleRequest(LoanRequest request);
}

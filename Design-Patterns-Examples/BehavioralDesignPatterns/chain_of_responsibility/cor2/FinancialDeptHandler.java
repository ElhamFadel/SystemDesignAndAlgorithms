package cor2;

public class FinancialDeptHandler extends LoanHandler{

	float budget = 500000;

	@Override
	public boolean handleRequest(LoanRequest request) {
		if(request.amount <=10000 && budget >=200000){
			System.out.println("F. Deprt. gives OK");
			return this.getSuccessor().handleRequest(request);
		}else{
			System.out.println("F. Deprt. rejects request");
			return false;
		}
	}
}

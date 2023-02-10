package cor2;

public class Main {

	public Main() {
		
	}

	public static void main(String[] args) {
		HRHandler hr = new HRHandler();
		FinancialDeptHandler fdh = new FinancialDeptHandler();
		GeneralManagerHandler gmh = new GeneralManagerHandler();
		TreasuryHandler th = new TreasuryHandler();
		
		
		hr.setSuccessor(fdh);
		fdh.setSuccessor(gmh);
		gmh.setSuccessor(th);
		
		LoanRequest request = new LoanRequest();
		request.amount = 5000;
		request.empEvaluation = 4;
		request.indebt = false;
		request.urgent = 2;
		
		System.out.println(hr.handleRequest(request));
		
	}

}

package cor2;

public class GeneralManagerHandler extends LoanHandler{



	@Override
	public boolean handleRequest(LoanRequest request) {
		if(request.urgent >=3 || (request.urgent < 3 && request.empEvaluation>=6)){
			System.out.println("General managers gives OK");
			return this.getSuccessor().handleRequest(request);
		}else{
			System.out.println("General managers rejects request");
			return false;
		}
	}
}

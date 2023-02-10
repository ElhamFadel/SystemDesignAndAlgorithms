package cor2;

public class HRHandler extends LoanHandler{



	@Override
	public boolean handleRequest(LoanRequest request) {
		if(request.urgent >= 3 || (request.urgent<3 && !request.indebt)){
			System.out.println("HR gives OK");
			return this.getSuccessor().handleRequest(request);
		}else{
			System.out.println("HR rejects due to non-urgent request or indebt");
			return false;
		}
	}

}

package cor2;

public class TreasuryHandler extends LoanHandler{



	@Override
	public boolean handleRequest(LoanRequest request) {
		System.out.println("Treasury pays for employee");
		return true;
	}
}


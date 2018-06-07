package abstract_factory_pattern;

public class HomeLoan extends Loan {

	@Override
	void getInterestRate(double rate) {
		this.rate = rate;
	}

	public static void main(String[] args) {
		HomeLoan hl = new HomeLoan();
		hl.getInterestRate(12);
		hl.calculateLoanPayment(1200000, 1);
	}
}

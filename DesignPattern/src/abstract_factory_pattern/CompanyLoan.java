package abstract_factory_pattern;

public class CompanyLoan extends Loan{

	@Override
	void getInterestRate(double rate) {
		this.rate = rate;
	}

}

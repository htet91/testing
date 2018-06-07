package abstract_factory_pattern;

public class LoanFactory extends AbstractFactory {

	@Override
	public Bank getBank(String bank) {
		return null;
	}

	@Override
	public Loan getLoan(String loan) {
		if("HOMELOAN".equals(loan))
			return new HomeLoan();
		return null;
	}

}

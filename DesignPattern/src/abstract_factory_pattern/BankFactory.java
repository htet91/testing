package abstract_factory_pattern;

public class BankFactory extends AbstractFactory {

	@Override
	public Bank getBank(String bank) {
		if("KBZ".equals(bank))
			return new KBZBank();
		else if("AYA".equals(bank))
			return new AYABank();
		return null;
	}

	@Override
	public Loan getLoan(String loan) {
		return null;
	}

}

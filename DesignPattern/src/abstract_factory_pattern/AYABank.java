package abstract_factory_pattern;

public class AYABank implements Bank {
	private final String bankName;

	public AYABank() {
		bankName = "AYA";
	}

	@Override
	public String getBankName() {
		return bankName;
	}

}

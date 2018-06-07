package abstract_factory_pattern;

public class KBZBank implements Bank {
	private final String bankName;

	public KBZBank() {
		bankName = "KBZ";
	}

	@Override
	public String getBankName() {
		return bankName;
	}

}

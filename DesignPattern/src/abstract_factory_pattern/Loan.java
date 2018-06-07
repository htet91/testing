package abstract_factory_pattern;

public abstract class Loan {
	protected double rate;

	abstract void getInterestRate(double rate);

	public void calculateLoanPayment(double loanamount, int years) {
		/*
		 E = A . r(1+r)n / ((1+r)n - 1)
		 

		Where,
		A = Amount borrowed
		E = EMI or Monthly payment
		r = interest rate in % divided by 12
		n = total number of months 
		 * 
		 */

		double EMI;
		int n;

		n = years * 12;
		rate = rate / 1200;
		EMI = ((Math.pow((1 + rate), n)) / ((Math.pow((1 + rate), n)) - 1)) * loanamount * rate;

		System.out.println("your monthly EMI is " + EMI + " for the amount" + loanamount + " you have borrowed");
		System.out.println("Total EMI : " + (EMI * n));
	}
}

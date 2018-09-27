import java.lang.Math;
import org.junit.Test;

public class LoanCalc {
	
	private double totalPrice;
	private double downPayment;
	private double lengthOfLoan;
	private double interestRate;
	
	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}

	public void setDownPayment(double downPayment) {
		this.downPayment = downPayment;
	}

	public void setLengthOfLoan(double lengthOfLoan) {
		this.lengthOfLoan = lengthOfLoan;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

	public double monthlyPayment()
	{
		double monthly = interestRate / 12;
		return (totalPrice - downPayment) * 
				(monthly * Math.pow((1 + monthly), lengthOfLoan)) / 
				(Math.pow((1 + monthly), lengthOfLoan) - 1);
	}
	
	public double totalInterest()
	{
		return (monthlyPayment() * lengthOfLoan) - (totalPrice + downPayment);
	}
	
	
	@Test
	public void paymentTest()
	{
		setTotalPrice(35000);
		setDownPayment(0);
		setLengthOfLoan(60);
		setInterestRate(.1);
		
		double a = monthlyPayment();
		double b = totalInterest();
		System.out.println(a);
		System.out.println(b);
	}

}

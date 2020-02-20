package epam.Task4;

public class CompundInterest {

	public double calculatecompoundinterest(double principalamount,double periodoftime,double rateofinterestperyear)
	{
		double compoundinterestamount=principalamount*Math.pow(1.0+rateofinterestperyear/100.0,periodoftime)-principalamount;
		return compoundinterestamount;
	}
}

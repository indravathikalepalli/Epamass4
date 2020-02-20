package epam.Task4;

public class SimpleInterest {
 
	public double calculatesimpleinterest(double principalamount,double periodofyears,double rateofinterestperyear)
	
	{
		double simpleinterestamount;
		simpleinterestamount=(principalamount*rateofinterestperyear*periodofyears)/100;
		return simpleinterestamount;
	}
}

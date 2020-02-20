package epam.Task4;

public class EstimateCostofHouse {
 
	public double totalamount(String name,double squarefoot)
	{
		GetHouseTypeMaterial housetypematerial=new GetHouseTypeMaterial();
		TotalCost total=house_typematerial.getPlan(name);
		total.getcostpersqarefeet();
		double totalamt=total.calculateBill(squarefoot);
		return totalamt;
		
	}
}

package epam.Task4;

public abstract class TotalCost {
	protected double cost;
	abstract void getcostpersqarefeet();
		public double calculateBill(double squarefoot)
		{
			return (squarefoot*cost);
		}
}

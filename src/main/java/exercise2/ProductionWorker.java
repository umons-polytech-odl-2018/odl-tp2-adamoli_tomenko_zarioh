package exercise2;

public class ProductionWorker implements Payable {
	private int producedPieceRate;
	private int retribution=0;

	public ProductionWorker(int a)
	{
		producedPieceRate=a;
	}

	public void produceOnePiece() {
		retribution++;
	}

	public int computeSalary() {
		return retribution*producedPieceRate;
	}
}

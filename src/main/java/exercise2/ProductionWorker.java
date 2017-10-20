package exercise2;

public class ProductionWorker implements Payable{

	private int productionWorkerSalary,numberPieces=0,salaryperProducedPiece;

	public ProductionWorker(int salaryPerProducedPiece){
		this.salaryperProducedPiece=salaryPerProducedPiece;
	}

	public void produceOnePiece() {
		numberPieces++;
	}

	public int computeSalary() {

		productionWorkerSalary =numberPieces * salaryperProducedPiece;
		return productionWorkerSalary;
	}
}

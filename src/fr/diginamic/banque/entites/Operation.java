package fr.diginamic.banque.entites;

public abstract class Operation {
	private String dateOperation;
	private double montantOperation;
	
	public Operation(String dateOperation, double montantOperation) {
		this.dateOperation = dateOperation;
		this.montantOperation = montantOperation;
	}
	
	public abstract String getType();
	
	

	public String getDateOperation() {
		return dateOperation;
	}

	public void setDateOperation(String dateOperation) {
		this.dateOperation = dateOperation;
	}

	public double getMontantOperation() {
		return montantOperation;
	}

	public void setMontantOperation(double montantOperation) {
		this.montantOperation = montantOperation;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Operation [dateOperation=");
		builder.append(dateOperation);
		builder.append(", montantOperation=");
		builder.append(montantOperation);
		builder.append("]");
		return builder.toString();
	}
	
	
	
}

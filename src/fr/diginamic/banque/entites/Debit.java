package fr.diginamic.banque.entites;

public class Debit extends Operation {

	public Debit(String dateOperation, double montantOperation) {
		super(dateOperation, montantOperation);
	}
	
	@Override
	public String getType() {
		return this.getClass().getSimpleName().toUpperCase();
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
//		builder.append("Debit : ");
		builder.append(super.toString());
		return builder.toString();
	}

	
	
	

}

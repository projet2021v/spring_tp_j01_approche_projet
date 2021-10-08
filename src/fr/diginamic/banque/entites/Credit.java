package fr.diginamic.banque.entites;

public class Credit extends Operation {

	public Credit(String dateOperation, double montantOperation) {
		super(dateOperation, montantOperation);
	}
	
	@Override
	public String getType() {
		return this.getClass().getSimpleName().toUpperCase();
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
//		builder.append("Credit : ");
		builder.append(super.toString());
		return builder.toString();
	}

	
	
	

}

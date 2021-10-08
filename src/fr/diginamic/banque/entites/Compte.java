package fr.diginamic.banque.entites;

public class Compte {
	private String numeroCompte;
	private double soldeCompte;
	
	public Compte(String numeroCompte, double soldeCompte) {
		super();
		this.numeroCompte = numeroCompte;
		this.soldeCompte = soldeCompte;
	}

	public String getNumeroCompte() {
		return numeroCompte;
	}

	public void setNumeroCompte(String numeroCompte) {
		this.numeroCompte = numeroCompte;
	}

	public double getSoldecompte() {
		return soldeCompte;
	}

	public void setSoldecompte(double soldecompte) {
		this.soldeCompte = soldecompte;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Compte [numeroCompte=");
		builder.append(numeroCompte);
		builder.append(", soldeCompte=");
		builder.append(soldeCompte);
		builder.append("]");
		return builder.toString();
	}
}
